package LeetCodeProblem;
public class Problem167_TwoSumII {
	public static void main(String[] args) {
		int[] arr= {2,7,11,15};
		
		int[] a=twoSum(arr,9);
		System.out.println(a[0]+" "+a[1]);
	}
	public static int[] twoSum(int[] numbers, int target) {
        int left = 0; 
         int[] ans = new int[2];
        // represents second pointer
        int right = numbers.length-1; 
        while (left < right) { 
            // If we find a pair
            if (numbers[left] + numbers[right] == target){
                ans[0]=left+1;
                ans[1]=right+1;
                break;
            } 
            // If sum of elements at current
            // pointers is less, we move towards
            // higher values by doing i++
            else if (numbers[left] + numbers[right] < target)
                left++; 
            // If sum of elements at current
            // pointers is more, we move towards
            // lower values by doing j--
            else
                right--;
        }
        return ans;
   
    }
}
