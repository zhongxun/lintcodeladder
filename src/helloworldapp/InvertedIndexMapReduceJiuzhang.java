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
public class InvertedIndexMapReduceJiuzhang {

    public static class Map {

        public void map(String s, Document value,
                OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, int value);
            String content = value.content;
            StringBuffer temp = new StringBuffer("");
            int id = value.id;
            for (int i = 0; i < content.length(); i++) {
                if (content.charAt(i) == ' ') {
                    if (temp.length() > 0) {
                        output.collect(temp.toString(), id);
                    }
                } else {
                    temp.append(content.charAt(i));
                }
            }

            if (temp.length() > 0) {
                output.collect(temp.toString(), id);
            }
        }
    }

    public static class Reduce {

        public void reduce(String key, Iterator<Integer> values,
                OutputCollector<String, List<Integer>> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, List<Integer> value);
            List<Integer> results = new ArrayList<Integer>();
            HashMap<Integer, Boolean> dict = new HashMap<Integer, Boolean>();
            while (values.hasNext()) {
                Integer v = values.next();
                if (!dict.containsKey(v)) {
                    results.add(v);
                    dict.put(v, true);
                }
            }

            Collections.sort(results);
            output.collect(key, results);
        }
    }
}
