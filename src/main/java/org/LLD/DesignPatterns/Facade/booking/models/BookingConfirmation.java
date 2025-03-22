package org.LLD.DesignPatterns.Facade.booking.models;

import java.time.LocalDate;

public class BookingConfirmation {

    private String userId;
    private String accommodationId;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    public BookingConfirmation(String userId, String accommodationId, LocalDate checkInDate, LocalDate checkOutDate) {
        this.userId = userId;
        this.accommodationId = accommodationId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getUserId() {
        return userId;
    }

    public String getAccommodationId() {
        return accommodationId;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }
}
