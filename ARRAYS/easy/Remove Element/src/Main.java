
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[4];
		arr[0] = 3;
		arr[1] = 2;
		arr[2] = 2;
		arr[3] = 3;
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println(removeElement(arr, 2));
	}
	
	public static int removeElement(int[] nums, int val) {
        int count = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
    }

}
