/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

//import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/**
 *
 * @author v-xuzhon
 */
public class IntersectionofTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) {
            return null;
        }

        if (nums1.length == 0 || nums2.length == 0) {            
            return new int[0];
        }
        
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        
        HashSet<Integer> srcHash = new HashSet<Integer>(m);
        HashSet<Integer> tgtHash = new HashSet<Integer>(m);
        
        for(int i = 0; i < m; i++) {
            srcHash.add(nums1[i]);
        }
        
        for(int i = 0; i < n; i++) {
            int tgt = nums2[i];
            if (srcHash.contains(tgt) && ! tgtHash.contains(tgt)) {
                tgtHash.add(tgt);
            }
        }
        
        int[] result = new int[tgtHash.size()];

        int i = 0;
        for (int j : tgtHash) {
            result[i++] = j;
        }
        
        return result;
    }
    
    public int[] intersectionBST(int[] nums1, int[] nums2) {
        int[] result = new int[10];
        return result;
    }
}
