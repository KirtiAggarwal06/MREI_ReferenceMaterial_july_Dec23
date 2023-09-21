package LeetCodeProblem;

public class Problem198_HouseRober_1 {
	public static void main(String[] args) {
		int[] nums= {2,7,9,3,1};
		System.out.println(rob(nums));
	}
		public static int rob(int[] nums) {
	        int[] dp=new int[nums.length];	
	        if(nums.length==1){
	            return nums[0];
	        }
	        dp[0]=nums[0];
	        dp[1]=Math.max(nums[0],nums[1]);
	        for(int i=2;i<nums.length;i++){
	            dp[i]=Math.max(nums[i]+dp[i-2],dp[i-1]);
	        }	
	        return dp[nums.length-1];		
	    }
}
