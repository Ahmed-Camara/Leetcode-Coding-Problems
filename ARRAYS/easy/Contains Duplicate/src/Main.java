import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 1;
		
		int[] num = new int[4];
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;
		num[3] = 4;
		
		int[] numss = new int[10];
		numss[0] = 1;
		numss[1] = 1;
		numss[2] = 1;
		numss[3] = 3;
		numss[4] = 3;
		numss[5] = 4;
		numss[6] = 3;
		numss[7] = 2;
		numss[8] = 4;
		numss[9] = 2;
		
		int[] Nums = new int[2];
		Nums[0] = 3;
		Nums[1] = 3;
		
		System.out.println(containsDuplicate(nums));
		System.out.println(containsDuplicate(num));
		System.out.println(containsDuplicate(numss));
		System.out.println(containsDuplicate(Nums));
	}
	
	public static boolean containsDuplicate(int[] nums) {
		
		Arrays.sort(nums);
		for(int i = 0; i < nums.length-1; i+=1) {
			
			if(nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

}
