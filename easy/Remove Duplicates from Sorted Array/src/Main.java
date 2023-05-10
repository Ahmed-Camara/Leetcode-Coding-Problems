import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		int myArr [] = {0,0,1,1,1,2,2,3,3,4};
		//int myArr [] = {1,1,2};
		for(int i = 0; i < myArr.length; i++) {
        	
			System.out.print(myArr[i] + " ");
        }
		System.out.println();
		System.out.println(removeDuplicates(myArr));
	}
	
	public static int removeDuplicates(int[] nums) {
        int count = 0;
		for(int i = 1; i < nums.length; i++) {
			
			if(nums[count] != nums[i]) {
				nums[++count] = nums[i];
			}
		}
        return count+1;
    }
}
