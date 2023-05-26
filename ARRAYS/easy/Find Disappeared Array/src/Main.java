
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {

		int[] nums1 = new int[8];
		nums1[0] = 4;
		nums1[1] = 3;
		nums1[2] = 2;
		nums1[3] = 7;
		nums1[4] = 8;
		nums1[5] = 2;
		nums1[6] = 3;
		nums1[7] = 1;
		
		int[] nums2 = new int[2];
		nums2[0] = 1;
		nums2[1] = 1;
		
		List<Integer> results = findDisappearedNumbers(nums1);
		
		for(int inter : results) {
			System.out.print(inter+" ");
		}
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		
		Set<Integer> results = new HashSet<>();
		
		
		for(int i = 1; i <= nums.length; i++) {
			results.add(i);
		}
		
		for (int num : nums) {
	        results.remove(num);
	    }
		
		
		return new ArrayList<>(results);
	}
}
