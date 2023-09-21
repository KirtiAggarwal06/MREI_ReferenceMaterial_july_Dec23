package LeetCodeProblem;
//sliding window technique
public class Problem122_TimeToBuyAndSellStock {
	public static void main(String[] args) {
		int[] a= {7,1,5,3,6,4};
		System.out.println(maxProfit(a));
	}
	 public static int maxProfit(int[] prices) {
	     int left=0,right=left+1,profit=0;
	     while(right<prices.length){
	         if(prices[left]<=prices[right])
	             profit=profit+prices[right]-prices[left];
	              left++;
	              right++;        
	     }
	     return profit;
	    }

}
