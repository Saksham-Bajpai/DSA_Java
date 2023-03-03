public class trappingRainwater {
    public static int trap(int[] height) 
    {
        int n = height.length;
        int left = 0; int right = n-1;
        int maxleft = 0; int maxright = 0;
        int res = 0;
        while (left <= right)
        {
            if(height[left] <= height[right])
            {
                if (height[left] >= maxleft)
                maxleft = height[left];
                else
                res += maxleft - height[left];
                left++;
            }
            else
            {
                if (height[right] >= maxright)
                maxright = height[right];
                else
                res += maxright - height[right];
                right--;
            }
        } 
        return res;
    }
    public static void main(String[] args) {
        int[] height = {1,0,2,1,0,3,2,0,2,0,1};
        trap(height);
    }
}