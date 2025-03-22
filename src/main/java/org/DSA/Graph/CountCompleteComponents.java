package org.DSA.Graph;

import java.util.ArrayList;

public class CountCompleteComponents {

    public static int countCompleteComponents(int n, int[][] edges) {

        ArrayList<Integer>[] adjArr = adjacentArr(n, edges);

        boolean[] vistedArr = new boolean[n];

        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!vistedArr[i]) {
                int[] componentInfo = new int[2];

                dfs(adjArr, i, vistedArr, componentInfo);
                // Check if component is complete - edges should be vertices * (vertices-1)
                if (componentInfo[0] * (componentInfo[0] - 1) == componentInfo[1]) {
                    components++;
                }
            }
        }

        return components;
    }

    public static void dfs(ArrayList<Integer>[] adjArr, int src, boolean[] vistedArr, int[] componentInfo) {
        vistedArr[src] = true;

        componentInfo[0]++; // Increment vertex count
        componentInfo[1] += adjArr[src].size(); // Add edges from current vertex

        ArrayList<Integer> adjList = adjArr[src];

        for (int nbr : adjList) {
            if (!vistedArr[nbr]) {
                dfs(adjArr, nbr, vistedArr, componentInfo);
            }
        }
    }

    public static ArrayList<Integer>[] adjacentArr(int n, int[][] edges) {

        ArrayList<Integer>[] adjArr = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adjArr[i] = new ArrayList<>();
        }

        for (int i = 0; i < edges.length; i++) {
            adjArr[edges[i][0]].add(edges[i][1]);
            adjArr[edges[i][1]].add(edges[i][0]);
        }

        return adjArr;
    }
}
