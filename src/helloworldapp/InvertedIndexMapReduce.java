/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class InvertedIndexMapReduce {

    public static class Map {

        public void map(String s, Document value,
                OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, int value);
            String[] words = value.content.split(" ");
            for (String word : words) {
                if (word.length() == 0) {
                    continue;
                }

                output.collect(word, value.id);
            }
        }
    }

    public static class Reduce {

        public void reduce(String key, Iterator<Integer> values,
                OutputCollector<String, List<Integer>> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, List<Integer> value);
            HashSet<Integer> results = new HashSet<Integer>();
            while (values.hasNext()) {
                results.add(values.next());
            }

            List<Integer> list = new ArrayList<Integer>(results);
            Collections.sort(list);
            output.collect(key, list);

        }
    }
}
