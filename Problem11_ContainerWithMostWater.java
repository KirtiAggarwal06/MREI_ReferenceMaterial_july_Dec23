package LeetCodeProblem;
public class Problem11_ContainerWithMostWater {
	public static void main(String[] args){ 
	     int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
	     System.out.println(maxArea(arr));
	}
	public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right){
            int area=(right-left)*Math.min(height[right],height[left]);
            max_area=Math.max(area,max_area);
            if(height[left]<height[right])
                left++;
            else
                right--;
        }
        return(max_area);
      }
}
