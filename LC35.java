// 35. Search Insert Position
public class LC35 {
    /*public static int searchInsert(int[] arr, int target){  //Time complexity:- O(n);
        for (int i =0; i< arr.length; i++){
            if (arr[i] == target)
                return i;
            else if (arr[i]>target) {
                return i;
            }
        }
        return arr.length;
    }*/

    public static int searchInsert(int[] arr, int target){  // Time Complexity:- O(log n) due to Binary Search.
        int start = 0;
        int end = arr.length-1;
        while(start<= end){
            int mid = (start + end)/2;
            if (arr[mid] == target) return mid;
            else if (target< arr[mid]) end = mid-1;
            else start = mid+1;
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr, target));
    }
}
