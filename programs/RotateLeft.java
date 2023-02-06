package programs;

/*
 * A left rotation operation on an array of size n shifts each of the array's elements
 *  1 unit to the left. Given an integer, d, rotate the array that many steps left and 
 * return the result.

Example
d = 2
arr = [1, 2, 3, 4, 5]

After 2 rotations, arr = [3, 4, 5, 1, 2].
 */
import java.util.*;

public class RotateLeft{
    public static List<Integer> leftRotation(int d, List<Integer> arr){
        int len = arr.size();
        int i = d;
        int j = 0;
        List<Integer> newArr = new ArrayList<>();

        while(i < len){
            newArr.add(arr.get(i));
        }

        while(j < d){
            newArr.add(arr.get(j));
        }

        return newArr;
    }

    public static void main(String[] args){
        int d = 4;
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 6; i++){
            arr.add(i);
        }
        System.out.println(RotateLeft.leftRotation(d, arr));
    }
}