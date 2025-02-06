package org.DSA.BackTracking;

import java.util.ArrayList;

public class ShortestPath {

    public int FindShortestPath(ArrayList<ArrayList<Integer>> A, int B, int C, int D, int E) {

        int min = findShortest(A,B,C,D,E);
        return min == Integer.MAX_VALUE ? -1 : min;
    }


    public int findShortest(ArrayList<ArrayList<Integer>> A, int sr, int sc, int dr, int dc) {

        int n = A.size();
        int m = A.get(0).size();

        if(sr == dr && sc == dc){
            return 0;
        }

        int[][] dirArr = new int[4][2];

        int minPath = Integer.MAX_VALUE;

        dirArr[0][0] = 0;
        dirArr[0][1] = -1;

        dirArr[1][0] = -1;
        dirArr[1][1] = 0;

        dirArr[2][0] = 0;
        dirArr[2][1] = 1;

        dirArr[3][0] = 1;
        dirArr[3][1] = 0;

        for(int i=0;i<4;i++){
            int nr = sr + dirArr[i][0];
            int nc = sc + dirArr[i][1];

            if(nr >= 0 && nr < n && nc >= 0 && nc < m &&  A.get(nr).get(nc) == 1){
                A.get(nr).set(nc,0) ;
                minPath  = Math.min(minPath,findShortest(A,nr,nc,dr,dc));
                A.get(nr).set(nc,1) ;
            }
        }

        return minPath == Integer.MAX_VALUE ? Integer.MAX_VALUE : minPath+1;


    }
}

