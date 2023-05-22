import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[7];
		nums[0] = 2;
		nums[1] = 2;
		nums[2] = 1;
		nums[3] = 1;
		nums[4] = 1;
		nums[5] = 2;
		nums[6] = 2;
		
		int[] num = new int[3];
		num[0] = 3;
		num[1] = 2;
		num[2] = 3;
		
		int[] numss = new int[6];
		numss[0] = -1;
		numss[1] = 1;
		numss[2] = 1;
		numss[3] = 1;
		numss[4] = 2;
		numss[5] = 1;
		
		System.out.println(majorityElement(num));
	}
	
	public static int majorityElement(int []nums) {
		Arrays.sort(nums);
        int count = 0;
		int middle = nums.length / 2;
		int len = nums.length;

        for(int i = 0; i < len; i++) {
			
			for(int j = i + 1; j < len; j++) {
				
				if(nums[i] != nums[j]) {
					break;
				}else {
					count++;
				}
			}
			if(count == middle) {
				return nums[i];
			}
			count = 0;
		}
		return -1;
	}

}
