import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		nums[3] = 1;
		
		int[] num = new int[4];
		num[0] = 1;
		num[1] = 0;
		num[2] = 1;
		num[3] = 1;
		
		int[] numss = new int[6];
		numss[0] = 1;
		numss[1] = 2;
		numss[2] = 3;
		numss[3] = 1;
		numss[4] = 2;
		numss[5] = 3;
		
		System.out.println(containsNearbyDuplicate(nums,3));
		System.out.println(containsNearbyDuplicate(num,1));
		System.out.println(containsNearbyDuplicate(numss,2));

	}
	
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
		//Arrays.sort(nums);
		int j = 0;
		System.out.println(nums.length);
		for(int i = 0; i < nums.length; i++) {
			j = i + 1;
			
			if(nums[i] == nums[j]) {
				return true;
			}
		}
		/*int j = 0;
		Set<Integer> list = new HashSet<>();
		for(int i = 0; i < nums.length; i++) {
			
			if(Math.abs(j - i) <= k) {
				if(list.contains(nums[i]))
					return true;
				
				
			}
			list.add(nums[i]);	
			
		}*/
		return false;
	}

}
