// 31. Next Permutation
public class LC31 {
    public static void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while(i >= 0 && nums[i + 1] <= nums[i]) {
            i--;
        }
        if(i >= 0) {
            int j = nums.length - 1;
            while(j > i && nums[j] <= nums[i]) {
                j--;
            }
            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
        reverse(nums, i + 1);
    }

    private static void reverse(int[] nums, int start) {
        int l = start;
        int r = nums.length - 1;
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,5,4,3};
        nextPermutation(arr);
        for (int i: arr){
            System.out.print(i+", ");
        }
    }
}
