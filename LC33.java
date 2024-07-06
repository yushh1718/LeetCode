// 33. Search in Sorted Rotated Array
public class LC33 {
    public static int search(int[] num, int target){
        int start = 0; int end = num.length-1;
        while(start<= end){
            int mid = (start+end)/2;
            if (num[mid]== target){
                return mid;
            }
            if(num[start]<= num[mid]){
                if(target<=num[mid] && target>= num[start]){
                    end = mid-1;
                } else{
                    start = mid+1;
                }
            } else if(num[mid]<= target && target <= num[end]){
                start = mid+1;
            } else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5, 1, 3};
        int target = 5;
        System.out.println(search(arr, target));
    }
}
