// 1. Two Sum
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LC1 {
    public static int[] twoSum(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<arr.length; i++){
            if(map.containsKey(target- arr[i])){
                return new int[] {i, map.get(target - arr[i])};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int key = 9;
        System.out.print(Arrays.toString(twoSum(numbers, key)));
    }
}
