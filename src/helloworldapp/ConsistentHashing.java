/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class ConsistentHashing {

    public static List<List<Integer>> consistentHashing(int n) {
        // Write your code here
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        List<Integer> machine = new ArrayList<Integer>();
        machine.add(0);
        machine.add(359);
        machine.add(1);
        results.add(machine);
        for (int i = 1; i < n; ++i) {
            List<Integer> new_machine = new ArrayList<Integer>();
            int index = 0;
            for (int j = 1; j < i; ++j) {
                if (results.get(j).get(1) - results.get(j).get(0) + 1 >
                    results.get(index).get(1) - results.get(index).get(0) + 1)
                    index = j;
            }

            int x = results.get(index).get(0);
            int y = results.get(index).get(1);
            results.get(index).set(1, (x + y) / 2);
            
            new_machine.add((x + y) / 2 + 1);
            new_machine.add(y);
            new_machine.add(i + 1);
            results.add(new_machine);
        }
        return results;
    }
    
    public static List<List<Integer>> consistentHashing2(int n) {
        int block = 1;
        while(block < n){
            block <<= 1;
        }
        
        int step = 360 / block; 
        
        List<Integer> l = new ArrayList<>();
        l.add(1);
        int i = 2;
        while (i<=n) {            
            List<Integer> nl = new ArrayList<>();
            for(Integer j: l){
               nl.add(j);
               if (i>n) continue;
               nl.add(i++);
            }
            l = nl;
        }
        
        List<List<Integer>> res = new ArrayList<>();
        
        int pos  = 0;
        for(Integer j: l)
        {
            List<Integer> e = new ArrayList<>();
            e.add(pos);
            e.add(pos + step -1);
            e.add(j);
            pos += step ;
            if (j == n)
            {
                step <<= 1;
            }
            
            res.add(e);
        }      
        
        return res;
    }

    public static void Test() {
      consistentHashing(5) ;
    }
}
