/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author v-xuzhon
 */
public class RateLimiter {

    private HashMap<String, LinkedList<Integer>> map = new HashMap<>();

    /**
     * @param timestamp the current timestamp
     * @param event the string to distinct different event
     * @param rate the format is [integer]/[s/m/h/d]
     * @param increment whether we should increase the counter
     * @return true or false to indicate the event is limited or not
     */
    public boolean is_ratelimited(int timestamp, String event, String rate, boolean increment) {
        // Write your code here

        if (!map.containsKey(event)) {
            map.put(event, new LinkedList<Integer>());
        }

        if (increment) {
            map.get(event).add(timestamp);
        }

        LinkedList<Integer> timestamps = map.get(event);

        String[] rates = rate.split("/");
        int range = 0;

        int cnt = new Integer(rates[0]);
        switch (rates[1]) {
            case "s":
                range = 1;
                break;
            case "m":
                range = 60;
                break;
            case "h":
                range = 3600;
                break;
            case "d":
                range = 86400;
                break;
        }

        while (!timestamps.isEmpty() && timestamps.getFirst() + range <= timestamp) {
            timestamps.removeFirst();
        }

        if( timestamps.size() > cnt)
        {
            map.get(event).removeLast();
            return true;
        }
        else
            return false;
        
    }

    private void T() {
        is_ratelimited(1, "login", "3/m", true);
        is_ratelimited(11, "login", "3/m", true);
        is_ratelimited(21, "login", "3/m", true);
        is_ratelimited(30, "login", "3/m", true);
        is_ratelimited(65, "login", "3/m", true);
        is_ratelimited(300, "login", "3/m", true);
    }

    public static void Test() {
        RateLimiter r = new RateLimiter();
        r.T();
    }
}
