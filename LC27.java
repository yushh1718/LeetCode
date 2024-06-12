public class LC27 {
    public static int rmvElement(int[] arr, int key){
        int count =0;
        for (int i=0; i<arr.length; i++){
            if (arr[i]!= key){
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
        int key = 2;
        System.out.println(rmvElement(arr, key));
        for (int i: arr)
            System.out.print(i+" ");
    }
}
