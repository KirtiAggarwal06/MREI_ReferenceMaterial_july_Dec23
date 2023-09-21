package LeetCodeProblem;
public class Problem34_FirstAndLastIndexInAnSortedArray {
	public static void main(String[] args) {
		int[] nums= {3,5,6,6,6,8,9};
		int[] ans=searchRange(nums,6);
		System.out.println(ans[0]+" "+ans[1]);
	}
	 public static int[] searchRange(int[] nums, int target) {
	        int left= FindLeft(nums,target);
	        int right=FindRight(nums,target);
	        return new int[] {left,right};
	    }
	    public static int FindLeft(int[] nums,int target){
	        int index=-1,low=0,high=nums.length-1;
	        while(low<=high){
	            int mid=low+(high-low)/2;
	            if(nums[mid]==target){ //traverse in the left subarray
	                index=mid;
	                high=mid-1;
	            }
	            else if(nums[mid]>target)
	                high=mid-1;
	            else
	                low=mid+1;

	        }
	        return index;
	    }
	     public static int FindRight(int[] nums,int target){
	        int index=-1,low=0,high=nums.length-1;
	        while(low<=high){
	            int mid=low+(high-low)/2;
	            if(nums[mid]==target){ //traverse in the right subarray
	                index=mid;
	                low=mid+1;
	            }
	            else if(nums[mid]>target)
	                high=mid-1;
	            else
	                low=mid+1;
	        }
	        return index;
	    }

}
