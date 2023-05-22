import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[5];
		nums[0] = 4;
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 1;
		nums[4] = 2;
		
		int[] num = new int[3];
		num[0] = 2;
		num[1] = 2;
		num[2] = 1;
		System.out.println(singleNumber(num));
	}
	
	public static int singleNumber(int[] nums) {
		
		Arrays.sort(nums);
		
		int len = nums.length-1;
		for(int i = 0; i < len ; i+=2) {
			
			if(nums[i] != nums[i+1]){
				return nums[i];
			}
		}

        return nums[len];
    }

}
