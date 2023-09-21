package LeetCodeProblem;
import java.util.Scanner;
public class Problem74_Search2DMatrix {
	public static void main(String[] args) {
		// Array MUST BE SORTED
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 17,18, 19 } };
		printarray(arr);
		System.out.println(searchMatrix(arr));
	}
	public static void printarray(int[][] arr1) {
		for (int r = 0; r < arr1.length; r++) {
			for (int c = 0; c < arr1[r].length; c++) {
				System.out.print(arr1[r][c] + "  ");
			}
			System.out.println();
		}
	}
	public static boolean searchMatrix(int[][] arr1) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value to search");
		int val = sc.nextInt();
		if(arr1.length==0)
			return false;		
		int n = arr1.length; // no of rows
		int m = arr1[0].length; // no of columns
		int low = 0;
		int high=n*m-1;
		while(low<=high) {
			int mid=(low+(high-low)/2);
			if(arr1[mid/m][mid%m]==val) {
				return true;
			}
			else if(arr1[mid/m][mid%m]<val) {
				low=mid+1;
			}
			else
				high=mid-1;
		}
		return false;
	}
}
