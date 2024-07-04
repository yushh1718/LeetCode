// 11. Container With Most Water
public class LC11 {
    // -----------------> O(n^2) approach (TLE)<-----------------------

    public static int maxArea(int[] height){
        int maxArea =0; int n = height.length;
        for (int i=0; i<n-1; i++){
            for (int j= i+1; j< n; j++){
                int area = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    // -----------------> Time taken: 5ms <-----------------------
    public static int maxArea2(int[] height){
        int maxArea = 0; int n = height.length;
        int i= 0; int j = n-1;
        while(i<=j){
            int area = Math.min(height[i], height[j]) * (j-i);
            maxArea = Math.max(maxArea, area);
            if(height[i]<= height[j]){
                i++;
            } else{
                j--;
            }
        }
        return maxArea;
    }

    // -----------------> Time Taken: 1ms <-----------------------
    public int maxArea3(int[] height) {
        int maxArea = 0; int minHeight;
        int i=0; int j= height.length-1;
        while(i<j){
            minHeight = Math.min(height[i], height[j]);
            maxArea = Math.max(maxArea, minHeight* (j-i));

            while(i<j && height[i]<= minHeight){
                i++;
            }
            while(i<j && height[j]<= minHeight){
                j--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea2(height));
    }
}
