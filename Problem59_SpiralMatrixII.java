package LeetCodeProblem;
public class Problem59_SpiralMatrixII {
	public static void main(String[] args) {
		int[][] ans=null;
		ans=generateMatrix(3);
		for(int i=0;i<ans.length;i++) {
			for(int j=0;j<ans[0].length;j++) {
				System.out.print(ans[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
       int top=0,bottom=n-1,left=0,right=n-1,  dir=1;
		int count=(bottom+1)*(right+1);
        int num=1;
		while((left<=right)&&(top<=bottom)){
			if(count>0){
				if(dir==1){
					for(int i=left;i<=right;i++){
						matrix[top][i]=num;
                        num++;
						count--;
					}
					dir=2;
					top++;					
				}
			}
			if(count>0){
				if(dir==2){
					for(int i=top;i<=bottom;i++){
						matrix[i][right]=num;
                        num++;
						count--;
					}
					dir=3;
					right--;
					
				}
			}
			if(count>0){
				if(dir==3){
					for(int i=right;i>=left;i--){
					    matrix[bottom][i]=num;
                        num++;
						count--;
					}
					dir=4;
					bottom--;					
				}
			}
			if(count>0){
				if(dir==4){
					for(int i=bottom;i>=top;i--){
						    matrix[i][left]=num;
                            num++;
						count--;
					}
					dir=1;
					left++;					
				}
			}


		}
		return matrix;  
    }
}
