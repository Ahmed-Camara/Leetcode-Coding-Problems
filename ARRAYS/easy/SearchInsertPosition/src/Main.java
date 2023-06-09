

//35. Search Insert Position

public class Main {

	public static void main(String[] args) {
		
		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 3;
		nums[2] = 5;
		nums[3] = 6;
		
		System.out.println(searchInsert(nums,7));
	}
	
	public static int searchInsert(int[] nums, int target) {
		
		int low = 0; int high = nums.length-1;
		
		while(low <= high) {
			
			int mid = (low + high) / 2;
			
			if(nums[mid] == target) {
				return mid;
			}
			
			if(target > nums[mid]) {
				
				low = mid + 1;
				
			}else if(target < nums[mid]){
				
				high = mid - 1;
			}
		}
		return low;
	}
}
