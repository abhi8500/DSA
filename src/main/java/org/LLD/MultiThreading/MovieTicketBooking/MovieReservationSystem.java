package org.LLD.MultiThreading.MovieTicketBooking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MovieReservationSystem {

    private int availableSeats;

    private Lock reservationLock;

    public MovieReservationSystem(int availableSeats){
        this.availableSeats = availableSeats;
        reservationLock = new ReentrantLock();
    }

    public boolean  reserveSeats(int numSeats){
        try{
            reservationLock.lock();
            System.out.println(Thread.currentThread().getName());
            if (availableSeats >= numSeats){
                availableSeats -= numSeats;
                return  true;
            }else {
                return false;
            }
        }finally {
            reservationLock.unlock();
        }

    }

    public int getAvailableSeats(){
        return this.availableSeats;
    }
}
