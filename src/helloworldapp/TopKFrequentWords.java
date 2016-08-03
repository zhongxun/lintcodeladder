/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javafx.collections.transformation.SortedList;

/**
 *
 * @author v-xuzhon
 */
public class TopKFrequentWords {

    public static class Map {

        public void map(String _, Document value,
                OutputCollector<String, Integer> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, int value);
            String[] words = value.content.split(" ");
            for (String s : words) {
                if (s.length() == 0) {
                    continue;
                }

                output.collect(s, 1);
            }
        }
    }

    public static class Reduce {

        private int k = 0;
        private HashMap<String, Integer> map = new HashMap<String, Integer>();

        public void setup(int k) {
            // initialize your data structure here
            this.k = k;
        }

        public void reduce(String key, Iterator<Integer> values) {
            // Write your code here
            int cnt = 0;
            while (values.hasNext()) {
                cnt += values.next();
            }

            if (!map.containsKey(key)) {
                map.put(key, 0);
            }

            map.put(key, cnt + map.get(key));
        }

        public void cleanup(OutputCollector<String, Integer> output) {
            // Output the top k pairs <word, times> into output buffer.
            // Ps. output.collect(String key, Integer value);
            HashMap<Integer, List<String>> map = new HashMap<Integer, List<String>>();
            List<Integer> list =  new ArrayList<Integer>();
            for (java.util.Map.Entry<String, Integer> entry : this.map.entrySet()) {
                int v = entry.getValue();
                if (!map.containsKey(v)) {
                    map.put(v, new ArrayList<String>());
                    list.add(v);
                }
                
                map.get(v).add(entry.getKey());
            }

            Collections.sort(list);
            Collections.reverse(list);
            
            while (this.k > 0) {                
                for (Integer i : list) {
                    for (String s : map.get(i)) {
                        output.collect(s, this.map.get(s));
                        this.k--;
                        if (this.k == 0) {
                            return;
                        }
                    }
                }
            }
        }
    }
}
