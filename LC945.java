import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 945. Minimum increment to make array unique.
public class LC945 {
    /*public static int minIncrementForUnique(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i =0; i<arr.length; i++){
            if (!map.containsValue(arr[i])){
                map.put(i, arr[i]);
            } else{
                while(map.containsValue(arr[i])){
                    arr[i]++;
                    count++;
                }
                map.put(i, arr[i]);
            }
        }
        return count;
    }*/

    public static int minIncrementForUnique(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i =1; i<arr.length; i++){
            if (arr[i]<= arr[i-1]){
                count+= arr[i-1]- arr[i] + 1;
                arr[i] = arr[i-1]+1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 3, 7};
        // sorted array--> 1, 2, 2, 3, 3, 7
        //updated array--> 1, 2, 3, 4, 5, 7
        System.out.println(minIncrementForUnique(arr));
    }
}
