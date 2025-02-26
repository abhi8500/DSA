package org.DSA.Strings;

import java.util.ArrayList;
import java.util.List;
public class AmazonInventory {
}


class Result {
    /*
     * Complete the 'numberOfItems' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. INTEGER_ARRAY startIndices
     *  3. INTEGER_ARRAY endIndices
     */

    public static List<Integer> numberOfItems(
            String s, List<Integer> startIndices, List<Integer> endIndices) {
        // Write your code here

        List<Integer> ansList = new ArrayList<>();

        int startIndex1 = startIndices.get(0);
        int endIndex1 = endIndices.get(0);

        int startIndex2 = startIndices.get(1);
        int endIndex2 = endIndices.get(1);

        ansList.add(countInventory(s, startIndex1, endIndex1));

        ansList.add(countInventory(s, startIndex2, endIndex2));
        return ansList;
    }

    public static int countInventory(String s, int startIndex, int endIndex) {
        int count = 0;
        int ans = 0;

        boolean open = false;
        for (int i = startIndex; i <= endIndex; i++) {
            if (s.charAt(i) == '|') {
                if (!open) {
                    open = true;
                } else {
                    ans += count;
                    count = 0;
                }
            } else {
                if (open) {
                    count++;
                }
            }
        }

        return ans;
    }
}

//    public class Solution {
//        public static void main(String[] args) throws IOException {
//            BufferedReader bufferedReader =
//                    new BufferedReader(new InputStreamReader(System.in));
//            BufferedWriter bufferedWriter =
//                    new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//            String s = bufferedReader.readLine();
//
//            int startIndicesCount =
//                    Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> startIndices =
//                    IntStream.range(0, startIndicesCount)
//                            .mapToObj(i -> {
//                                try {
//                                    return bufferedReader.readLine().replaceAll("\\s+$", "");
//                                } catch (IOException ex) {
//                                    throw new RuntimeException(ex);
//                                }
//                            })
//                            .map(String::trim)
//                            .map(Integer::parseInt)
//                            .collect(toList());
//
//            int endIndicesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//            List<Integer> endIndices =
//                    IntStream.range(0, endIndicesCount)
//                            .mapToObj(i -> {
//                                try {
//                                    return bufferedReader.readLine().replaceAll("\\s+$", "");
//                                } catch (IOException ex) {
//                                    throw new RuntimeException(ex);
//                                }
//                            })
//                            .map(String::trim)
//                            .map(Integer::parseInt)
//                            .collect(toList());
//
//            List<Integer> result = Result.numberOfItems(s, startIndices, endIndices);
//
//            bufferedWriter.write(
//                    result.stream().map(Object::toString).collect(joining("\n")) + "\n");
//
//            bufferedReader.close();
//            bufferedWriter.close();
//        }
//    }
