/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/**
 *
 * @author v-xuzhon
 */
public class SequenceReconstruction {

    /**
     *
     * @param org
     * @param seqs
     * @return
     */
//    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
//        // Write your code here
//        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
//        Map<Integer, Integer> indegree = new HashMap<Integer, Integer>();
//
//        for (int num : org) {
//            map.put(num, new HashSet<Integer>());
//            indegree.put(num, 0);
//        }
//
//        int n = org.length;
//        int count = 0;
//        for (int[] seq : seqs) {
//            count += seq.length;
//            if (seq.length >= 1 && (seq[0] < 1 || seq[0] > n)) {
//                return false;
//            }
//            for (int i = 1; i < seq.length; i++) {
//                if (seq[i] < 1 || seq[i] > n) {
//                    return false;
//                }
//                if (map.get(seq[i - 1]).add(seq[i])) {
//                    indegree.put(seq[i], indegree.get(seq[i]) + 1);
//                }
//            }
//        }
//
//        // case: [1], []
//        if (count < n) {
//            return false;
//        }
//
//        Queue<Integer> q = new LinkedList<Integer>();
//        for (int key : indegree.keySet()) {
//            if (indegree.get(key) == 0) {
//                q.add(key);
//            }
//        }
//
//        int cnt = 0;
//        while (q.size() == 1) {
//            for (int next : map.get(q.poll())) {
//                indegree.put(next, indegree.get(next) - 1);
//                if (indegree.get(next) == 0) {
//                    q.add(next);
//                }
//            }
//            cnt++;
//        }
//
//        return cnt == org.length;
//    }
    public boolean sequenceReconstruction(int[] org, int[][] seqs) {
        // Write your code here
        Map<Integer, Set<Integer>> map = new HashMap<Integer, Set<Integer>>();
        Map<Integer, Integer> indegree = new HashMap<Integer, Integer>();

        int len = org.length;

        for (int num : org) {
            map.put(num, new HashSet<Integer>());
            indegree.put(num, 0);
        }

        int count = 0;

        for (int[] seq : seqs) {
            count += seq.length;

            if (seq.length >= 1 && (seq[0] < 1 || seq[0] > len)) {
                return false;
            }

            for (int i = 1; i < seq.length; i++) {
                if (seq[i] < 1 || seq[i] > len) {
                    return false;
                }

                if (map.get(seq[i - 1]).add(seq[i])) {
                    indegree.put(seq[i], indegree.get(seq[i]) + 1);
                }
            }
        }

        if (count < len) {
            return false;
        }

        Queue<Integer> queue = new LinkedList<Integer>();
        int cnt = 0;

        for (int key : indegree.keySet()) {
            if (indegree.get(key) == 0) {
                queue.offer(key);
            }
        }

        while (queue.size() == 1) {
            for (int next : map.get(queue.poll())) {
                indegree.put(next, indegree.get(next) - 1);
                if (indegree.get(next) == 0) {
                    queue.offer(next);
                }
            }
            cnt++;
        }
        List<Coordinate> t = new ArrayList<Coordinate>();

        return cnt == len;
    }
}
