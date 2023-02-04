package programs;

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
