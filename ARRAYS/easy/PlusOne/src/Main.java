
public class Main {
	
public static void main(String[] args) {
		
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		int[] arr = new int[1];
		arr[0] = 8;
		
		
		for(int s : nums) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		for(int s : plusOne(nums)) {
			System.out.print(s+" ");
		}
		//System.out.println(plusOne(nums));
	}
	
	public static int[] plusOne(int[] digits) {
		
		
		int max = -9999, indexMax = 0;
		
		if(digits.length == 1) {
			return addOne(digits);
		}
		
		
		int flag = 1;
		
		for(int i = 1; i < digits.length; i++) {
			
			if(digits[i] != digits[0]) {
				flag=0;
				break;
			}
		}
		
		if(flag == 1) {
			return addOne(digits[0]);
		}
		
		
		
		for(int i = 0; i < digits.length; i++) {
			
			if(digits[i] > max) {
				indexMax = i;
			}
		}
		
		digits[indexMax] += 1;
		
		return digits;
	}
	
	public static int[] addOne(int digits) {
		int num = digits + 1;
		
		if(num >= 10) {
			int firstNum = num%10;
			num /= 10;
			return new int[] {num, firstNum};
		}
		return new int[] {num};
	}
	
	public static int[] addOne(int[] digits) {
		return addOne(digits[0]);
		/*int num = digits[0] + 1;
		
		if(num >= 10) {
			int firstNum = num%10;
			num /= 10;
			return new int[] {num, firstNum};
		}
		return new int[] {num};*/
	}
}
