/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.LinkedList;

/**
 *
 * @author v-xuzhon
 */
public class WebLogger {

    private LinkedList<Integer> timesatmps;

    public WebLogger() {
        // initialize your data structure here.
        this.timesatmps = new LinkedList<Integer>();
    }

    /**
     * @param timestamp an integer
     * @return void
     */
    public void hit(int timestamp) {
        // Write your code here
        this.timesatmps.add(timestamp);
    }

    /**
     * @param timestamp an integer
     * @return an integer
     */
    public int get_hit_count_in_last_5_minutes(int timestamp) {
        // Write your code here
        while (!this.timesatmps.isEmpty() && this.timesatmps.getFirst() + 300 <= timestamp) {
            this.timesatmps.removeFirst();
        }

        return this.timesatmps.size();
    }

    private void T() {
        hit(1);
        hit(2);
        get_hit_count_in_last_5_minutes(3);
        hit(300);
        get_hit_count_in_last_5_minutes(300);
        get_hit_count_in_last_5_minutes(301);
    }

    public static void Test() {
        WebLogger w = new WebLogger();
        w.T();
    }
}
