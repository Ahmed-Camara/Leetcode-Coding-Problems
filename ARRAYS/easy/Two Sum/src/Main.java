
public class Main {

	public static void main(String[] args) {
		
		int[] arr = new int[4];
		arr[0] = 15;
		arr[1] = 11;
		arr[2] = 7;
		arr[3] = 2;
		
		int target = 9;
		int []index = twoSum(arr, target);
		
		for(int i = 0; i < index.length; i++) {
			System.out.print(index[i]+" ");
		}
	}
	
	public static int[] twoSum(int []nums, int target) {
		int []index = new int[2];
		for(int i = 1; i < nums.length; i++) {
			
			int j = i - 1;
			
			while(j >= 0) {
				
				if(nums[i] + nums[j] == target) {
					index[0] = j;
					index[1] = i;
					return index;
				}
				j--;
			}
		}
		return null;
	}

}
