/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author v-xuzhon
 */
public class ConsistentHashingII1 {

    private int n, k;
    private Set<Integer> ids = null;
    private Map<Integer, List<Integer>> machines = null;

    // @param n a positive integer
    // @param k a positive integer
    // @return a Solution object
    public static ConsistentHashingII1 create(int n, int k) {
        // Write your code here
        ConsistentHashingII1 solution = new ConsistentHashingII1();
        solution.n = n;
        solution.k = k;
        solution.ids = new TreeSet<>();
        solution.machines = new HashMap<>();
        return solution;
    }

    // @param machine_id an integer
    // @return a list of shard ids
    public List<Integer> addMachine(int machine_id) {
        // Write your code here
        Random ra = new Random();
        List<Integer> random_nums = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int index = ra.nextInt(n);
            while (ids.contains(index)) {
                index = ra.nextInt(n);
            }
            ids.add(index);
            random_nums.add(index);
        }
        
        Collections.sort(random_nums);
        machines.put(machine_id, random_nums);
        return random_nums;
    }

    // @param hashcode an integer
    // @return a machine id
    public int getMachineIdByHashCode(int hashcode) {
        // Write your code here
        int distance = n + 1;
        int machine_id = 0;
        for (Map.Entry<Integer, List<Integer>> entry : machines.entrySet()) {
            Integer key = entry.getKey();
            List<Integer> random_nums = entry.getValue();
            for (Integer num : random_nums) {
                int d = num - hashcode;
                if (d < 0) {
                    d += n;
                }

                if (d < distance) {
                    distance = d;
                    machine_id = key;
                }
            }
        }

        return machine_id;
    }

    public static void Test() {
        ConsistentHashingII1 c = ConsistentHashingII1.create(100, 3);
        List<Integer> r = c.addMachine(1);
        System.out.println(r);
        int m = c.getMachineIdByHashCode(4);
        System.out.println(m);
        r = c.addMachine(2);
        System.out.println(r);
        m = c.getMachineIdByHashCode(61);
        System.out.println(m);
        m = c.getMachineIdByHashCode(91);
        System.out.println(m);
    }
}
