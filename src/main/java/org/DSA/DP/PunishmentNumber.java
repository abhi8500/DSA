package org.DSA.DP;

public class PunishmentNumber {


    private boolean canPartition(String currentNumStr,int target){

        if (currentNumStr.isEmpty() && target == 0){
            return true;
        }

        /// Invalid Partition Found
        if (target < 0) {
            return false;
        }

        for (int i=0;i<currentNumStr.length();i++) {
            String leftStr = currentNumStr.substring(0,i+1);
            String rightStr = currentNumStr.substring(i+1);

            int leftNum = Integer.parseInt(leftStr);
            if (canPartition(rightStr,target-leftNum)){
                return true;
            }
        }

        return false;
    }

    public int punishmentNumber(int n) {
        int punishmentNum = 0;

        // Iterate through numbers in range [1, n]
        for (int currentNum = 1; currentNum <= n; currentNum++) {
            int squareNum = currentNum * currentNum;

            // Check if valid partition can be found and add squared number if so
            if (canPartition(Integer.toString(squareNum), currentNum)) {
                punishmentNum += squareNum;
            }
        }
        return punishmentNum;
    }
    /// Code using dp
    // public int punishmentNumber(int n) {

    //     int punishmentNum = 0;

    //     for(int num=1;num <= n;num++){
    //         int numSqr =  num*num;
    //         String numStr = Integer.toString(numSqr);

    //         int[][] memo = new int[numStr.length()][num+1];

    //         for(int[] row : memo){
    //             Arrays.fill(row,-1);
    //         }
    //         if(findPartitions(0,0,num,numStr,memo)){
    //             punishmentNum += numSqr;
    //         }
    //     }

    //     return punishmentNum;

    // }

    // private boolean findPartitions(int startIndex, int sum, int target, String numStr, int[][] memo) {

    //     // Check if partition is valid
    //     if(startIndex == numStr.length()){
    //         return sum == target;
    //     }

    //     /// Invalid partition found ,so we return false
    //     if(sum > target){
    //         return false;
    //     }

    //     if(memo[startIndex][sum] != -1){

    //     }

    //     boolean partitionFound = false;

    //     for(int i=startIndex;i<numStr.length();i++){
    //         /// Create partition
    //         String currentString =  numStr.substring(
    //            startIndex,i+1
    //         );

    //         int addend = Integer.parseInt(currentString);

    //         partitionFound = partitionFound ||
    //         findPartitions(i+1,sum + addend,target,numStr,memo);
    //         if(partitionFound){
    //             memo[startIndex][sum] = 1;
    //             return true;
    //         }
    //     }

    //     memo[startIndex][sum] = 0;

    //     return false;

    // }
}



