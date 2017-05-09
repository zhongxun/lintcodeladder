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
import java.util.Random;

/**
 *
 * @author v-xuzhon
 */
public class InsertDeleteGetRandom {
    Map<Integer, Integer> map;
    List<Integer> nums;
    Random rand;
    
    /** Initialize your data structure here. */
    public InsertDeleteGetRandom() {
        this.map = new HashMap<Integer, Integer>();
        this.nums = new ArrayList<Integer>();
        this.rand = new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (this.map.containsKey(val)) {
            return false;
        }
        
        this.map.put(val, this.nums.size() - 1);
        this.nums.add(val);
        
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!this.map.containsKey(val)) {
            return false;
        }
        
        int loc = this.map.get(val);
        
        if (loc < this.nums.size() - 1) {
            int last = this.nums.get(this.nums.size() - 1);
            this.nums.set(loc, last);
            this.map.put(val, loc);
        }
        
        this.map.remove(val);
        this.nums.remove(this.nums.size() - 1);
        
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        return this.nums.get(this.rand.nextInt(this.nums.size()));    
    }
}
