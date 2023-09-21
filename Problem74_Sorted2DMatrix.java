package LeetCodeProblem;
public class Problem74_Sorted2DMatrix {
	public static void main(String[] args) {
		//int[][] arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		int[][] arr= {{1}};
		System.out.println(searchMatrix(arr,1));
	}
	public static boolean searchMatrix(int[][] matrix, int target) {
	       if(matrix.length==0) 
	           return false;
	       int n = matrix.length; 
	       int m = matrix[0].length; 
	       int low = 0;
	       int high=n*m-1;
	       while(low<=high) {
	            int mid=(low+(high-low)/2);
	                if(matrix[mid/m][mid%m]==target) {
	                     return true;
	                }
	                else if(matrix[mid/m][mid%m]<target) {
	                     low=mid+1;
	                } 
	                else
	                	high=mid-1;
	                }
	                return false;					
		}  
}
