
public class Main {
	
public static void main(String[] args) {
		
		int[] nums = new int[3];
		nums[0] = 1;
		nums[1] = 2;
		nums[2] = 3;
		
		int[] arr = new int[1];
		arr[0] = 8;
		
		for(int s : plusOne(nums)) {
			System.out.print(s+" ");
		}
	}
	
	public static int[] plusOne(int[] digits) {
		
		
		int length = digits.length;
		
		for(int i = length - 1; i >= 0; i--) {
			
			if(digits[i] < 9) {
				digits[i]++;
				return digits;
			}
			digits[i] = 0;
		}
		
		int[] finalResult = new int[length + 1];
		finalResult[0] = 1;
		return finalResult;
	}
}
