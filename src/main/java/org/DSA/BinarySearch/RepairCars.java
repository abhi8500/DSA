package org.DSA.BinarySearch;

public class RepairCars {

    public long repairCars(int[] ranks, int cars) {

        int minRank = Integer.MAX_VALUE;
        int maxRank = Integer.MIN_VALUE;

        int n = ranks.length;

        for (int rank : ranks) {
            minRank = Math.min(minRank, rank);
            maxRank = Math.max(maxRank, rank);
        }

        int[] freq = new int[maxRank + 1];
        for (int rank : ranks) {
            freq[rank]++;
        }

        long low = 1;
        long high = 1L * minRank * cars * cars;

        while (low < high) {
            long mid = low + (high - low) / 2;
            long carsRepaired = 0;

            for (int rank = 1; rank <= maxRank; rank++) {
                carsRepaired += freq[rank] * (long) Math.sqrt(mid / (long) rank);
            }

            if (carsRepaired >= cars) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

}
