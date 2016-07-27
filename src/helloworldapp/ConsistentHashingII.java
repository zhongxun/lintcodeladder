package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author v-xuzhon
 */
public class ConsistentHashingII {

    public int n, k;
    //private Set<Integer> ids = null;
    //private Map<Integer, List<Integer>> machines = null;
    public Map<Integer, Integer> machines = null;
    public List<Integer> ids = null;

    // @param n a positive integer
    // @param k a positive integer
    // @return a Solution object
    public static ConsistentHashingII create(int n, int k) {
        // Write your code here
        ConsistentHashingII solution = new ConsistentHashingII();
        solution.n = n;
        solution.k = k;
        solution.ids = new ArrayList<>();
        solution.machines = new HashMap<>();
        return solution;
    }

    // @param machine_id an integer
    // @return a list of shard ids
    public List<Integer> addMachine(int machine_id) {
        // Write your code here
        List<Integer> list = new ArrayList<>();

        Random ra = new Random();
        for (int i = 0; i < k; i++) {
            int num = ra.nextInt(n);
            while (ids.contains(num)) {
                num = ra.nextInt(n);
            }
            ids.add(num);
            list.add(num);
            machines.put(num, machine_id);
        }

        Collections.sort(ids);
        Collections.sort(list);
        return list;
    }

    // @param hashcode an integer
    // @return a machine id
    public int getMachineIdByHashCode(int hashcode) {
        // Write your code here
        int start = 0;
        int end = ids.size() - 1;
        System.out.println("search in: " + ids);
        if (hashcode > ids.get(end)) {
            System.out.println("large then end, so 0");
            return machines.get(ids.get(0));
        }
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (ids.get(mid) == hashcode) {
                System.out.println("find mid" + mid);

                return machines.get(ids.get(mid));
            } else if (ids.get(mid) < hashcode) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        System.out.println(start + "  ->  " + end);
        return machines.get(ids.get(end));
    }

    public void T2() {
        List<Integer> m1 = Arrays.asList(0, 1, 7, 10, 11, 16, 18, 19, 20);
        List<Integer> m2 =  Arrays.asList(2,3,4,9,12,13,14,15,17);
        ids.addAll(m1);
        ids.addAll(m2);
        Collections.sort(ids);
        for (Integer i : m1) {
            machines.put(i, 7);
        }
        for (Integer i : m2) {
            machines.put(i, 8);
        }
        
        int r = getMachineIdByHashCode(6);
         System.out.println("T2: " + r);
    }

    public static void Test2() {
        ConsistentHashingII c = ConsistentHashingII.create(21, 9);
        c.T2();
    }

    public static void Test() {
        ConsistentHashingII c = ConsistentHashingII.create(100, 3);
        List<Integer> r = c.addMachine(1);
        System.out.println("Add 1: " + r);
        int m = c.getMachineIdByHashCode(4);
        System.out.println("Find 4: " + m);
        r = c.addMachine(2);
        System.out.println("Add 2: " + r);
        m = c.getMachineIdByHashCode(61);
        System.out.println("Find 61: " + m);
        m = c.getMachineIdByHashCode(91);
        System.out.println("Find 91: " + m);
    }
}
