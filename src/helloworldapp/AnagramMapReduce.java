/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class AnagramMapReduce {
    public static class Map {
        public void map(String key, String value,
                        OutputCollector<String, String> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, String value);
            String[] words = value.split(" ");
            for (String word : words) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                output.collect(new String(chars), word);
            }           
        }
    }

    public static class Reduce {
        public void reduce(String key, Iterator<String> values,
                           OutputCollector<String, List<String>> output) {
            // Write your code here
            // Output the results into output buffer.
            // Ps. output.collect(String key, List<String> value);
            List<String> list = new ArrayList<String>();
            while(values.hasNext()) {
                list.add(values.next());
            }
            
            output.collect(key, list);
        }
    }    
}
