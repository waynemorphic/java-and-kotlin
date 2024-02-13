package programs;

/*
 * Write a function

class Solution { public int solution(int[] A); }

that, given an array A consisting of N integers, returns the number of distinct values in array A.

For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Write an efficient algorithm for the following assumptions:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SortDistinct {
    public static int distinct(int[] arr){
        int count = 0;
        int len = arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < len; i++){
            do{
                i++;                
            }
            while (i < len - 1 && arr[i] == arr[i + 1]);
            count++;
        }
        return count;

    }

    // Method two
    public static int distinctSets(int[] arr){
        int len = arr.length;
        int count = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < len; i++){
            set.add(arr[i]);
        }
        count = set.size();
        return count;
    }

    public static void main(String[] args){
        int[] arr = {2, 1, 1, 7, 6, 4, 6, 8, 7};
        System.out.println(SortDistinct.distinct(arr));
        System.out.println(SortDistinct.distinctSets(arr));
    }
}
