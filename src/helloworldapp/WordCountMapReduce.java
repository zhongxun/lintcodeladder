/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author v-xuzhon
 */
public class WordCountMapReduce {

    public static class Map {

        public void map(String key, String value, OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, int value);
            String[] ss = value.split(" ");
            for (String s : ss) {
                if (s.trim().length() == 0) {
                    continue;
                }

                output.collect(s, 1);
            }
        }
    }

    public static class Reduce {

        public void reduce(String key, Iterator<Integer> values,
                OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, int value);
            int cnt = 0;
            while (values.hasNext()) {
                cnt += values.next();
            }

            output.collect(key, cnt);
        }
    }
}
