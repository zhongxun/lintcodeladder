/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author v-xuzhon
 */
public class LetterCombinationsofaPhoneNumber {
    private Map<String, ArrayList<String>> cache = new HashMap<String, ArrayList<String>>();
    private char[][] arr = { {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r'},
        {'s','t','u'},
        {'v','w','x'},
        {'y','z', '#'}
    };
    
    public ArrayList<String> letterCombinations(String digits) {
        // Write your code here
        ArrayList<String> result = new ArrayList<String>();
        
        if (digits == null || digits.length() == 0) {
            return result;
        }
        
        if (cache.containsKey(digits)) {
            return cache.get(digits);
        }
        
        for (char c : arr[digits.charAt(0) - '2']) {
            for (String s : letterCombinations(digits.substring(1))) {
                result.add(String.valueOf(c) + s);
            }
        }
        
        cache.put(digits, result);
        
        return result;
    }  
}
