/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author v-xuzhon
 */
public class WordBreakII {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        // Write your code here
        Map<String, ArrayList<String>> cache = new HashMap<String, ArrayList<String>>();
        int len = getMaxWordLen(wordDict);
        return wordBreakHelper(s, len, wordDict, cache);
    }
    
    private ArrayList<String> wordBreakHelper(String s, int maxWordLen, Set<String> wordDict, Map<String, ArrayList<String>> cache) {
        if (cache.containsKey(s)) {
            return cache.get(s);
        }
        
        ArrayList<String> results = new ArrayList<String>();
        if (s.length() == 0) {
            return results;
        }
        
        for (int len = 1; len <= s.length(); len++) {
            if (len > maxWordLen) {
                break;
            }
            
            String word = s.substring(0, len);
            if (wordDict.contains(word)) {
                if (len == s.length()) {
                    results.add(word);
                } else {
                    String suffix = s.substring(len);
                    ArrayList<String> wordBreakList = wordBreakHelper(suffix, maxWordLen, wordDict, cache);
                    for (String word2 : wordBreakList) {
                        results.add(word + " " + word2);
                    }
                }
            }
        }
        
        cache.put(s, results);
        return results;
    }
    
    private int getMaxWordLen(Set<String> wordDict) {
        int maxLen = 0;
        
        for (String word : wordDict) {
            maxLen = Math.max(maxLen, word.length());
        }
        
        return maxLen;
    }  
}
