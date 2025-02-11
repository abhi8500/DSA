package org.LLD.MultiThreading.MovieTicketBooking;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        MovieReservationSystem movieReservationSystem = new MovieReservationSystem(20);

        ExecutorService es = Executors.newFixedThreadPool(5);
        Runnable cus1 = () -> movieReservationSystem.reserveSeats(10);
        Runnable cus2 = () -> movieReservationSystem.reserveSeats(5);
        Runnable cus3 = () -> movieReservationSystem.reserveSeats(2);
        Runnable cus4 = () -> movieReservationSystem.reserveSeats(10);
        Runnable cus5 = () -> movieReservationSystem.reserveSeats(3);


        es.submit(cus1);
        es.submit(cus2);
        es.submit(cus3);
        es.submit(cus4);
        es.submit(cus5);


        es.shutdown();


    }
}
