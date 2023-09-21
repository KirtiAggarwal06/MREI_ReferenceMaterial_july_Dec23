package LeetCodeProblem;
// sliding window 
public class Problem283_Movezeroes {
	public static void main(String[] args) {
		int[] a= {0,1,0,3,12};
		moveZeroes(a);
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}
	 public static void moveZeroes(int[] nums) {
	        int left=0,right=left+1;
	        while(right<nums.length){
	            if(nums[left]==0){
	                if(nums[right]!=0){
	                nums[left]=nums[right];
	                nums[right]=0;
	                left++;
	                }
	                right++;
	            }
	            else{
	                right++;
	                left++;
	            }
	        }
	        
	    }

}
