package org.LLD.DesignPatterns.Facade.booking;

import org.LLD.DesignPatterns.Facade.booking.models.BookingConfirmation;
import org.LLD.DesignPatterns.Facade.booking.models.BookingResult;
import org.LLD.DesignPatterns.Facade.booking.models.PaymentStatus;
import org.LLD.DesignPatterns.Facade.booking.services.*;

import java.time.LocalDate;

public class BookingFacade {

    private AvailabilityService availabilityService;
    private PaymentService paymentService;
    private NotificationService notificationService;
    private LoyaltyService loyaltyService;
    private AccommodationDetailsService accommodationDetailsService;

    // Constructor for the BookingFacade class
    public BookingFacade(AvailabilityService availabilityService, PaymentService paymentService, NotificationService notificationService, LoyaltyService loyaltyService, AccommodationDetailsService accommodationDetailsService) {
        this.availabilityService = availabilityService;
        this.paymentService = paymentService;
        this.notificationService = notificationService;
        this.loyaltyService = loyaltyService;
        this.accommodationDetailsService = accommodationDetailsService;
    }

    // The process method provides a simplified interface for booking an accommodation.
    public BookingResult process(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {

        // Check availability of the accommodation
        boolean isAvailable = availabilityService.checkAvailability(accommodationId, checkInDate, checkOutDate);
        if (!isAvailable) {
            return BookingResult.notAvailable("Accommodation not available for the given dates");
        }

        // Make payment for the booking
        PaymentStatus paymentStatus = paymentService.makePayment(userId, accommodationId);
        if (paymentStatus != PaymentStatus.SUCCESS) {
            return BookingResult.paymentFailed("Payment failed with status: " + paymentStatus);
        }

        // Create a booking confirmation
        BookingConfirmation confirmation = new BookingConfirmation(userId, accommodationId, checkInDate, checkOutDate);

        // Send booking confirmation
        notificationService.sendBookingConfirmation(confirmation);

        // Update loyalty points
        loyaltyService.updateLoyaltyPoints(userId, paymentService.calculatePaymentAmount(accommodationId));

        // Update accommodation details
        accommodationDetailsService.updateAccommodationDetails(accommodationId, checkInDate, checkOutDate);

        // Return the booking result
        return BookingResult.success(confirmation);
    }

}
