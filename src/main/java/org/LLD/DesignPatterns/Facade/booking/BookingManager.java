package org.LLD.DesignPatterns.Facade.booking;

import org.LLD.DesignPatterns.Facade.booking.models.BookingConfirmation;
import org.LLD.DesignPatterns.Facade.booking.models.BookingResult;
import org.LLD.DesignPatterns.Facade.booking.models.PaymentStatus;
import org.LLD.DesignPatterns.Facade.booking.services.*;

import java.time.LocalDate;

public class BookingManager {

    private BookingFacade bookingFacade;

    public BookingManager(AvailabilityService availabilityService, PaymentService paymentService,
                          NotificationService notificationService, LoyaltyService loyaltyService,
                          AccommodationDetailsService accommodationDetailsService) {
        this.bookingFacade = new BookingFacade(availabilityService, paymentService, notificationService, loyaltyService, accommodationDetailsService);
    }

    // The bookAccommodation method provides a simplified interface for booking an accommodation.
    public BookingResult bookAccommodation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        return bookingFacade.process(userId, accommodationId, checkInDate, checkOutDate);
    }
}
