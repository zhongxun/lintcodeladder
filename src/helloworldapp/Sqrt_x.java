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
public class Sqrt_x {

    public int sqrt(int x) {
        // write your code here
        long r = x;
        while (r * r > x) {
            r = (r + x / r) / 2;
        }

        return (int) r;
    }
}
