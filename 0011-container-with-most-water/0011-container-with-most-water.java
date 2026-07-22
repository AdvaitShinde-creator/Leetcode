class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int i = 0;
        int j = height.length - 1;
        int dis = 0;

        while(i < j){
            dis = j - i;
            int area = Math.min(height[i], height[j]) * dis;
            if(maxArea < area){
                maxArea = area;
            }  
            if(height[i] <= height[j]){
                i++;
            }
            else if(height[i] > height[j]){
                j--;
            }
        }

        return maxArea;
    }
}