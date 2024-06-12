//26. Remove Duplicates from Sorted Array
public class LC26 {
    public static int removeDuplicate(int[] arr){
        int i=0;
        for (int j=0; j<arr.length; j++){
            arr[i++]= arr[j];
            while(j != arr.length-1 && arr[j] == arr[j+1]){
                j++;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3, 3, 4, 4};
        System.out.print(removeDuplicate(arr));
    }
}
