package LeetCodeProblem;
public class GFGProblem_CountTheZeroes {
	public static void main(String args[]) {
		int[] arr= {1,1,1,1,1,1,1,1,1,1,1,0};
		System.out.println(countZeroes(arr,11));
	}
	 static int countZeroes(int[] arr, int n) {
	        int low=0;
	        int high = n-1;
	        while(low<high){
	            int mid=low+(high-low)/2;
	            if(arr[mid]==1)
	                low=mid+1;
	            else
	                high=mid;
	        }
	        return n-high;
	    }
}

