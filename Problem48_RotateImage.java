package LeetCodeProblem;

public class Problem48_RotateImage {
	public static void main(String[] args) {
		int[][] arr= {{11,12,13,14},{21,22,23,24},{31,32,33,34},{41,42,43,44}};
		for(int i=0;i<arr.length;i++) {
        	for(int j=0;j<arr.length;j++) {
        		System.out.print(arr[i][j]+" ");
        	}
        	System.out.println();
        }
		rotate(arr);
	}
	public static void rotate(int[][] matrix) {
        int n=matrix.length;
        for (int i=0;i<(n+1)/2;i++){
            for(int j=0;j<n/2;j++){
                //bottom left take in temp
                int temp=matrix[n-1-j][i];
                //shift bottom right to botttom left
                matrix[n-1-j][i]=matrix[n-1-i][n-1-j];
                //shift top right to bottom right
                matrix[n-1-i][n-1-j]=matrix[j][n-1-i];
                //shift top left to top right
                matrix[j][n-1-i]=matrix[i][j];
                //shift temp to top left
                matrix[i][j]=temp;
            }
        }
        System.out.println("Matrix after rotation");
            for(int i=0;i<n;i++) {
            	for(int j=0;j<n;j++) {
            		System.out.print(matrix[i][j]+" ");
            	}
            	System.out.println();
            }
            
    }
}
