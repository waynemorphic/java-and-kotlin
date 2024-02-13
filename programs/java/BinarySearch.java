package programs;

public class BinarySearch {
    public static int search(int[] nums, int target){
        for (int i = 0; i  < nums.length; i++){
            if (nums[i] == target){
                System.out.println(nums[i]);
                return nums[i];
            }
        }
        System.out.println(-1);
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {-1, 2, 3, 4};
        int target = 6;
        BinarySearch.search(nums, target);
    }
}
