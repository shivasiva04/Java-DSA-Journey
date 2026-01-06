package com.siva.dsa.day01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class TwoSumSolver{
    public int[] findTargetIndices(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }

            map.put(nums[i],i);
        }


        return new int[]{-1,-1};
    }

}
public class TwoSumRunner {
    public static void main(String[]megs){
        TwoSumSolver obj = new TwoSumSolver();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size fo the array: ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the " + "'"+i+"' " + "index value: ");
            nums[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");

        int target = sc.nextInt();

        int[] result = obj.findTargetIndices(nums, target);

        System.out.println(Arrays.toString(result));

    }
}



// Optimized solution to find exact sum matching pair where sum = target. Using Hashmap O(n);
// Use Cases: Coupon, Payments Transaction and Fraud Detection, etc.
