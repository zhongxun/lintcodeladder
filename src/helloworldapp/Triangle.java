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
public class Triangle {

    public int minimumTotal(int[][] triangle) {
        // write your code here
        int rows = triangle.length;
        int cols = triangle[0].length;
        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            sum[i][0] = triangle[i][0];
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = triangle[i][j] + Math.min(sum[i - 1][j - 1], sum[i - 1][j]);
            }
        }

        return sum[rows - 1][cols - 1];
    }
}
