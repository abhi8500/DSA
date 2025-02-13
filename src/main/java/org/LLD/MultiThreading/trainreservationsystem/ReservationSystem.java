package org.LLD.MultiThreading.trainreservationsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReservationSystem {

    private final Map<String, Integer> availableSeats;

    private final Map<String, Lock> seatTypeLocks;

    public ReservationSystem(Map<String, Integer> availableSeats) {
        this.availableSeats = new HashMap<>(availableSeats);
        this.seatTypeLocks = new HashMap<>();
        for (String seatType : availableSeats.keySet()) {
            seatTypeLocks.put(seatType, new ReentrantLock());
        }
    }

    public boolean reserveSeats(String seatType, int noOfSeats) {
        Lock seatLock = seatTypeLocks.get(seatType);
        if (seatLock != null){
            seatLock.lock();
            try {
                int availableSeatsCount = getAvailableSeats(seatType);
                if (availableSeatsCount >= noOfSeats) {
                    availableSeats.put(seatType, availableSeatsCount - noOfSeats);
                    return true;
                }
                return false; // Not enough seats available
            } finally {
                seatLock.unlock();
            }
        }else{
            return false;
        }

    }

    public int getAvailableSeats(String seatType){
        return this.availableSeats.get(seatType);
    }
}
