package programs;

import java.util.ArrayList;

/* 
An array A consisting of N different integers is given. The array contains integers in 
the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

class Solution { public int solution(int[] A); }

that, given an array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
 */

import java.util.*;

public class PermMissingElem{
    public static int solution(int[] arr){
        /*
         * The sum of consequtive numbers is equal to n(n + 1)/2
         * Therefore, the difference between the sum of the full array and sum of the 
         * actual array will give the missing integer.
         */
        int n = arr.length;
        int res = 0;
        int actualSum = 0;
        int fullSum = 0;
        List<Integer> nums = new ArrayList<>();
        List<Integer> arrNums = new ArrayList<>();

        for (int i = 1; i <= n + 1; i++){
            nums.add(i);
        }
        fullSum = nums.stream().mapToInt(Integer::intValue).sum();

        for (int i : arr){
            arrNums.add(i);
        }
        actualSum = arrNums.stream().mapToInt(Integer::intValue).sum();

        res = fullSum - actualSum;
        return res;
    }
    public static void main(String[] args){
        int[] arr = {1, 3, 2, 5};
        System.out.println(PermMissingElem.solution(arr));
    }
}