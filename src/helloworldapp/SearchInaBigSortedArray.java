/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author v-xuzhon
 */
public class SearchInaBigSortedArray {

    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return : An integer which is the index of the target number
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int start = 0;
        int end = findEnd(reader, target);
        while(start + 1 < end) {
            int mid = start + ((end - start) >> 1);
            if (reader.get(mid) >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        
        if (reader.get(start) == target) {
            return start;
        }
        
        if (reader.get(end) == target) {
            return end;
        }
        
        return -1;
    }

    private int findEnd(ArrayReader reader, int target) {
        int start = 1;
        while(reader.get(start) != Integer.MAX_VALUE && reader.get(start) < target) {
            start <<= 1;
        }
        
        return start;
    }
}
