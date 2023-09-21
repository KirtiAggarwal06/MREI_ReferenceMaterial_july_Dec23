package LeetCodeProblem;

public class Problem53_MaximumSubrray {
	public static void main(String[] args) {
		int[] arr= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(arr));		
	}
	 public static int maxSubArray(int[] nums) {
		 int sum=0;
	        int ans=nums[0];
	        for(int i=0;i<nums.length;i++){           
	            sum=sum+nums[i];
	            ans=Math.max(ans,sum);
	            if(sum<0){
	                sum=0;
	            }
	        }
	        return ans;
        
    }
}
