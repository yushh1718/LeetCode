import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 15. 3 Sum
public class LC15 {
    public static List<List<Integer>> threeSum(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int n = arr.length;
        for (int i=0; i<n-2; i++){
            if (i>0 && arr[i] == arr[i-1]) continue;
            int j= i+1; int k= n-1;
            while(j<k){
            int tempSum = arr[i] + arr[j] + arr[k];
                if(tempSum == 0){
                    List<Integer> tempList = new ArrayList<>();
                    tempList.add(arr[i]);
                    tempList.add(arr[j]);
                    tempList.add(arr[k]);
                    result.add(tempList);

                    while(j<k && arr[j] == arr[j+1]) j++;
                    while(j<k && arr[k] == arr[k-1]) k--;
                    j++;
                    k--;
                }
                else if(tempSum < 0){
                    j++;
                } else{
                    k--;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr1 = {-1,0,1,2,-1,-4};
        int[] arr2 = {0,1,1};


        for (List<Integer> i : threeSum(arr2)) {
            System.out.print(i);
        }
    }
}
