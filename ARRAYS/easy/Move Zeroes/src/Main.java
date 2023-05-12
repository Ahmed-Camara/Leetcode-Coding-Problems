
/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
 * */


public class Main {

	public static void main(String[] args) {
		
		int[] nums = new int[5];
		nums[0] = 0;
		nums[1] = 1;
		nums[2] = 0;
		nums[3] = 3;
		nums[4] = 12;
		moveZeroes(nums);
	}
	
	public static void moveZeroes(int []nums) {
		
		int val = 0;
		int temp = 0;
		for(int i = 0; i < nums.length; i++) {
			
			if(nums[i] == 0) {
				temp = nums[i];
			}else {
				nums[val] = nums[i];
				nums[i] = temp;
				val = val + 1;
			}
		}
		for(int num : nums) {
			System.out.print(num+" ");
		}
	}

}
