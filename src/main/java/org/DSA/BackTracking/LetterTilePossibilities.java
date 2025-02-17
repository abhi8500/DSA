package org.DSA.BackTracking;

import java.util.HashSet;
import java.util.Set;

public class LetterTilePossibilities {

    public int numTilePossibilities(String tiles) {
        Set<String> sequences = new HashSet<>();
        int len = tiles.length();
        boolean[] used = new boolean[len];

        // Generate all possible sequences including empty string
        letterTiles(sequences, "", tiles, used);

        // Subtract 1 to exclude empty string from count
        return sequences.size() - 1;
    }

    private void letterTiles(Set<String> sequences,
                             String current, String tiles, boolean[] counted) {

        sequences.add(current);
        for (int i = 0; i < tiles.length(); i++) {
            if (!counted[i]) {
                counted[i] = true;
                letterTiles(sequences, current + tiles.charAt(i), tiles, counted);
                counted[i] = false;
            }
        }

    }
}
