/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class EditDistance {

    public int minDistance(String word1, String word2) {
        // write your code here
        int n = word1.length();
        int m = word2.length();
        int[][] f = new int[n + 1][m + 1];

        for (int i = 0; i <= n; i++) {
            f[i][0] = i;
        }

        for (int j = 0; j <= m; j++) {
            f[0][j] = j;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int min = Math.min(f[i - 1][j] + 1, f[i][j - 1] + 1);
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    f[i][j] = Math.min(min, f[i - 1][j - 1]);
                } else {
                    f[i][j] = Math.min(min, f[i - 1][j - 1] + 1);
                }
            }
        }

        return f[n][m];
    }
}
