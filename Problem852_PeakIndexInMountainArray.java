package LeetCodeProblem;
public class Problem852_PeakIndexInMountainArray {
	public static void main(String[] args) {
		int[] arr= {2,4,6,20,13,15,18};
		System.out.println(peakIndexInMountainArray(arr));
	}
	 public static int peakIndexInMountainArray(int[] arr) {
	        int low=0;
	        int high=arr.length-1;
	        while(low<high){
	            int mid=low+(high-low)/2;
	            if(arr[mid]<arr[mid+1]){
	                low=mid+1;
	            }
	            else if(arr[mid]>arr[mid+1]){
	                high=mid;
	            }
	        }
	        return low;
	    }
}
