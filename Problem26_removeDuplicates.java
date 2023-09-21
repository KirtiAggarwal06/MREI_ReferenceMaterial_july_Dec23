package LeetCodeProblem;
//Using sliding window technique
public class Problem26_removeDuplicates {
	public static void main(String[] args) {
		int[] arr= {0,0,1,1,1,2,2,3,3,4};
		System.out.println(removeDuplicates(arr));
	}
	public static int removeDuplicates(int[] nums) {
        int left=0,right=left+1;
        while(right<nums.length){
        	//if the elements same do nothing just 
        	//increment the right pointer
        	//else first increment the left pointer 
        	//and put the value of right in left
           if( nums[left]!=nums[right]){
                left++;
                nums[left]=nums[right];
           }
            right++;

           }     
           return left+1;   
     }

}
