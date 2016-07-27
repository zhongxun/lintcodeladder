/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author v-xuzhon
 */
public class _4Sum18 {

    public static void Test() {
        int[] nums = {1, 0, -1, 0, -2, 2};
        List<List<Integer>> r = fourSum(nums, 0);
        System.out.println(r);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        kSum(result, new ArrayList<Integer>(), nums, target, 4, 0, nums.length - 1);
        return result;
    }

    private static void kSum(List<List<Integer>> result, List<Integer> cur, int[] nums, int target, int k, int start, int end) {
        if (k == 0 || nums.length == 0 || start > end) {
            return;
        }
        if (k == 1) {
            for (int i = start; i <= end; i++) {
                if (nums[i] == target) {
                    cur.add(nums[i]);
                    result.add(new ArrayList<>(cur));
                    cur.remove(cur.size() - 1);
                }
            }
            return;
        }

        if (k == 2) { // 2 sum
            int sum;
            while (start < end) {
                sum = nums[start] + nums[end];

                if (sum == target) {
                    cur.add(nums[start]);
                    cur.add(nums[end]);
                    result.add(new ArrayList<Integer>(cur));
                    cur.remove(cur.size() - 1);
                    cur.remove(cur.size() - 1);

                    //avoid duplicate
                    while (start < end && nums[start] == nums[start + 1]) {
                        ++start;
                    }
                    ++start;
                    while (start < end && nums[end] == nums[end - 1]) {
                        --end;
                    }
                    --end;
                } else if (sum < target) {
                    //avoid duplicate
                    while (start < end && nums[start] == nums[start + 1]) {
                        ++start;
                    }
                    ++start;
                } else {
                    while (start < end && nums[end] == nums[end - 1]) {
                        --end;
                    }
                    --end;
                }
            }
            return;
        }

        //避免一些不必要case
        if (k * nums[start] > target || k * nums[end] < target) {
            return;
        }

        // k > 2 : choose nums[i] and do k-1 sum on the rest at right
        for (int i = start; i <= (end - k + 1); i++) {
            // avoid duplicate
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            // 重点
            if (k * nums[i] <= target) { //避免掉一些不必要case
                cur.add(nums[i]);
                kSum(result, cur, nums, target - nums[i], k - 1, i + 1, end);
                cur.remove(cur.size() - 1);
            }
        }

    }

    public static List<List<Integer>> fourSum2(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (nums == null || len < 4) {
            return res;
        }

        Arrays.sort(nums);

        int max = nums[len - 1];
        if (4 * nums[0] > target || 4 * max < target) {
            return res;
        }

        int i, z;
        for (i = 0; i < len; i++) {
            z = nums[i];
            if (i > 0 && z == nums[i - 1])// avoid duplicate
            {
                continue;
            }
            if (z + 3 * max < target) // z is too small
            {
                continue;
            }
            if (4 * z > target) // z is too large
            {
                break;
            }
            if (4 * z == target) { // z is the boundary
                if (i + 3 < len && nums[i + 3] == z) {
                    res.add(Arrays.asList(z, z, z, z));
                }
                break;
            }

            threeSumForFourSum(nums, target - z, i + 1, len - 1, res, z);
        }

        return res;
    }

    /*
     * Find all possible distinguished three numbers adding up to the target
     * in sorted array nums[] between indices low and high. If there are,
     * add all of them into the ArrayList fourSumList, using
     * fourSumList.add(Arrays.asList(z1, the three numbers))
     */
    public static void threeSumForFourSum(int[] nums, int target, int low, int high, ArrayList<List<Integer>> fourSumList,
            int z1) {
        if (low + 1 >= high) {
            return;
        }

        int max = nums[high];
        if (3 * nums[low] > target || 3 * max < target) {
            return;
        }

        int i, z;
        for (i = low; i < high - 1; i++) {
            z = nums[i];
            if (i > low && z == nums[i - 1]) // avoid duplicate
            {
                continue;
            }
            if (z + 2 * max < target) // z is too small
            {
                continue;
            }

            if (3 * z > target) // z is too large
            {
                break;
            }

            if (3 * z == target) { // z is the boundary
                if (i + 1 < high && nums[i + 2] == z) {
                    fourSumList.add(Arrays.asList(z1, z, z, z));
                }
                break;
            }

            twoSumForFourSum(nums, target - z, i + 1, high, fourSumList, z1, z);
        }

    }

    /*
     * Find all possible distinguished two numbers adding up to the target
     * in sorted array nums[] between indices low and high. If there are,
     * add all of them into the ArrayList fourSumList, using
     * fourSumList.add(Arrays.asList(z1, z2, the two numbers))
     */
    public static void twoSumForFourSum(int[] nums, int target, int low, int high, ArrayList<List<Integer>> fourSumList,
            int z1, int z2) {

        if (low >= high) {
            return;
        }

        if (2 * nums[low] > target || 2 * nums[high] < target) {
            return;
        }

        int i = low, j = high, sum, x;
        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum == target) {
                fourSumList.add(Arrays.asList(z1, z2, nums[i], nums[j]));

                x = nums[i];
                while (++i < j && x == nums[i]) // avoid duplicate
					;
                x = nums[j];
                while (i < --j && x == nums[j]) // avoid duplicate
					;
            }
            if (sum < target) {
                i++;
            }
            if (sum > target) {
                j--;
            }
        }
        return;
    }
}
