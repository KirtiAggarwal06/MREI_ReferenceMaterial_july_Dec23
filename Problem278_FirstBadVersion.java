package LeetCodeProblem;
public class Problem278_FirstBadVersion {
	public static void main(String[] args) {
		char[] arr= {'G','G','G','G','G','B','B','B'};
		System.out.println(firstBadVersion(arr));		
	}
	 public static int firstBadVersion(char[] arr) {
	        int low = 0;
	        int high = arr.length-1;
	        while(low<high){
	             int mid = low+(high-low)/2;
		        	 if(arr[mid]=='B')              
					       	high=mid;
		       		else 
		                low = mid+1;
		      }
	        
	        return high+1;
	    }
}
