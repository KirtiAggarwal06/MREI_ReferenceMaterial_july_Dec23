package LeetCodeProblem;
public class Problem152_MaxProductSubarray {
	public static void main(String[] args) {
		int[] arr= {2,3,-2,-5,6,-1,4};
		System.out.println(maxProduct(arr));		
	}
	public static int maxProduct(int[] nums) {
        int left_product=0;
        int right_product=0;
        int ans=nums[0];
        for(int i=0;i<nums.length;i++){
            if(left_product==0)
                left_product=1;
            if(right_product==0)
                right_product=1;
            left_product=left_product*nums[i];
            right_product=right_product*nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(left_product,right_product));
        }
        return ans;
    }
}
