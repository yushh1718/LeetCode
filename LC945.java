import java.util.Arrays;

// 945. Minimum increment to make array unique.
public class LC945 {
    //----------------------->Time Complexity Exceeds.<----------------------
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
    }*

    //-------------------->Time Complexity : O(n.log(n)) <----------------------
    /*public static int minIncrementForUnique(int[] arr){
        Arrays.sort(arr);
        int count = 0;
        for (int i =1; i<arr.length; i++){
            if (arr[i]<= arr[i-1]){
                count+= arr[i-1]- arr[i] + 1;
                arr[i] = arr[i-1]+1;
            }
        }
        return count;
    }*/

    //-------------------->Time Complexity : O(n) <----------------------
    public static int minIncrementForUnique(int[] arr){
        int[] frequency = new int[arr.length + Arrays.stream(arr).max().getAsInt()];
        int ans =0;
        for (int val : arr){
            frequency[val]++;
        }
        for (int i=0; i< frequency.length; i++){
            if (frequency[i]<= 1) continue;

            int duplicate = frequency[i] -1;
            frequency[i+1] += duplicate;
            frequency[i] = 1;
            ans += duplicate;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 2, 3, 7};
        // sorted array--> 1, 2, 2, 3, 3, 7
        //updated array--> 1, 2, 3, 4, 5, 7
        System.out.println("Minimum increment to make given array unique: "+minIncrementForUnique(arr));
    }
}
