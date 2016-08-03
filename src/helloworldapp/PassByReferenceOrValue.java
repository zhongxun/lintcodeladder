/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class PassByReferenceOrValue {

    private static void Test() {
        List<List<Integer>> results = new ArrayList<>();
        List<Integer> set = new ArrayList<>();
        Integer[] nums = {1, 2};
        T(results, set, nums, 0);
        System.out.println(results);
    }

    private static void T(List<List<Integer>> results, List<Integer> set, Integer[] nums, int start) {
        results.add(new ArrayList<>(set));
        if (start == 1) {
            set.add(100);
        }
        for (int i = start; i < nums.length; i++) {
            set.add(nums[i]);
            T(results, set, nums, i + 1);
            set.remove(set.size() - 1);
        }
    }
    
    private static void Test2(){
        List<Integer> set = new ArrayList<Integer>();
        set.add(100);
        Test3(set);
        System.out.println(set);
    }
    
    private static void Test3(List<Integer> set){
        set.add(200);
    }    
}
