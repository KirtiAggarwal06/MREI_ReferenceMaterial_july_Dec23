package LeetCodeProblem;
public class CodingNinjasProblem_FindNthRootofM {
	public static void main(String args[]) {
		System.out.println(NthRoot(3,27));
	}	
	public static int NthRoot(int n, int m) {
		int low=1;
        int high=m;
        double ans = 0;
        while(low<=high){
            int mid=low+(high-low)/2;
            ans=Math.pow(mid,n);
            if(ans>m)
                high=mid-1;
            else if(ans<m)
                low=mid+1;
            else
                return mid;
        }
        return -1;
	}
}
