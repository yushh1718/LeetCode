// 34. Find First and Last Position of Element in Sorted Array
public class LC34 {
    static int findStart(int[] num, int target, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (num[mid] == target) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int findEnd(int[] num, int target, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2 + 1;
            if (num[mid] == target) {
                start = mid;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
    public static int[] searchRange(int[] num, int target){
        int[] arr = new int[2];
        int n = num.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > num[mid]) {
                start = mid + 1;
            } else if (target < num[mid]) {
                end = mid - 1;
            } else {
                arr[0] = findStart(num, target, start, mid);
                arr[1] = findEnd(num, target, mid, end);
                return arr;
            }
        }
        return new int[] { -1, -1 };

    }

    public static void main(String[] args) {
        int[] num = {5,7,7,8,8,10};
        int target = 8;
        int[] result = searchRange(num, target);
        for (int i: result){
            System.out.print(i+" ");
        }
    }
}
