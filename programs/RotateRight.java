package programs;

import java.util.*;

public class RotateRight {
    public static String  rightRotation(int d, int[] arr){
        int len = arr.length;

        for (int i = 0; i < d; i++){
            int lastElem = 0;
            lastElem = arr[len - 1];

            for (int j = len - 1; j > 0; j--){
                arr[j] = arr[j - 1];
            }

            arr[0] = lastElem;
        }
        return Arrays.toString(arr);
    }
    public static void main(String[] args){
        int d = 3;
        int[] arr = {3, 8, 9, 7, 6};
        System.out.println(RotateRight.rightRotation(d, arr));
    }
}
