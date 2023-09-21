package LeetCodeProblem;
public class Problem1480_runningSumOf1DArray {
	public static void main(String[] args) {
		int[] a= {1,3,6,10};
		int[] b=runningSum(a);
		for(int i=0;i<b.length;i++)
			System.out.print(b[i]+" ");
		
	}
		 public static int[] runningSum(int[] nums) {
		        int left=0,sum=0;
		        while(left<nums.length){
		            sum=sum+nums[left];
		            nums[left]=sum;
		            left++;
		        }
		        return nums;        
		    }
}
