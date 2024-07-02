import java.util.HashMap;
import java.util.Map;

// 169. Majority Element
public class LC169 {
    // Used : boyer-moore majority vote algorithm
    public static int majorityElement(int[] num){
        int j = num[0]; int count =0;
        for (int i=0; i< num.length; i++){
            System.out.println(j+","+ count);
            if (num[i] == j){
                count++;
            } else{
                count--;
            }
            if(count <= -1){
                j = num[i];
                count =1;
            }
        }
        return j;
    }

    /*public static int majorityElement(int[] nums) { same same but different
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }*/
    public static void main(String[] args) {
        int[] arr = {6,5,5};
        int[] arr1 = {10,9,9,9,10};
        int[] arr2 = {2,2,1,1,1,2,2};
        int[] arr3 = {3,2,3};

        System.out.println(majorityElement(arr));
        System.out.println(majorityElement(arr1));
        System.out.println(majorityElement(arr2));
        System.out.println(majorityElement(arr3));
    }
}
