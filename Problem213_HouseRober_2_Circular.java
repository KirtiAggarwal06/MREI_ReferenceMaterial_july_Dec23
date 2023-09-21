package LeetCodeProblem;

public class Problem213_HouseRober_2_Circular {
	public static void main(String[] args) {
		int[] nums= {2,7,9,3,1};
		System.out.println(rob(nums));
	}
	public static int rob(int[] nums) {
        if(nums.length==1)
            return nums[0];
        //create two new arrays        
       int[] skipLastIndex=new int[nums.length-1];
       int[] skipFirstIndex=new int[nums.length-1];
       for(int i=0;i<nums.length-1;i++){
           skipLastIndex[i]=nums[i];
           skipFirstIndex[i]=nums[i+1];
       } 
       int Loot_Last=rob_198(skipLastIndex);
       int Loot_First=rob_198(skipFirstIndex);
       return Math.max(Loot_Last,Loot_First);
    }
     public static int rob_198(int[] nums) {
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
