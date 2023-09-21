package LeetCodeProblem;
import java.util.Scanner;
public class Problem867_TransposeAMatrix {
	public static void main(String[] args){			
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		transpose(arr,arr.length);
		for(int row=0;row<arr.length;row++){				
				for(int column=0;column<arr.length;column++){
					System.out.print(arr[row][column]+" ");
				}
				System.out.println();
			}			
	}	
	public static void transpose(int matrix[][], int n){
	        for(int i=0;i<n-1;i++){	
				for(int j =i+1;j<n;j++){
				   int temp;
		            temp=matrix[j][i];
				    matrix[j][i]=matrix[i][j];
				    matrix[i][j]=temp;
				}
			}
	    }
}

