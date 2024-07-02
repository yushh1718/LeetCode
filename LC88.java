// 88. Merge Sorted Arrays.
public class LC88 {
    public static void merge(int[] arr1, int m, int[] arr2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j>=0){
            if(i >= 0 && arr1[i] > arr2[j])
                arr1[k--] = arr1[i--];
            else
                arr1[k--] = arr2[j--];
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[6];
        for (int i=0; i<3; i++){
            arr1[i] = i+1;
        }

        int[] arr2 = {2, 5, 6};
        /*int m = arr1.length;
        int n = arr2.length;*/

        merge(arr1, 3, arr2, 3);
        for (int i: arr1){
            System.out.print(i+", ");
        }

    }
}
