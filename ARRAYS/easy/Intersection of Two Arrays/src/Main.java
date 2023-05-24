import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		int[] nums1 = new int[4];
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 2;
		nums1[3] = 1;
		
		int[] nums2 = new int[2];
		nums2[0] = 2;
		nums2[1] = 2;
		
		
		int[] nums3 = new int[3];
		nums3[0] = 4;
		nums3[1] = 9;
		nums3[2] = 5;
		
		int[] nums4 = new int[5];
		nums4[0] = 9;
		nums4[1] = 4;
		nums4[2] = 9;
		nums4[3] = 8;
		nums4[4] = 4;
		
		
		int[] intersection = intersection(nums1, nums2);
		
		for(int inter : intersection) {
			System.out.print(inter+" ");
		}
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		Set<Integer> firstSet = new HashSet<>();
		Set<Integer> results = new HashSet<>();
		
		for(int i = 0; i < nums1.length; i++)
			firstSet.add(nums1[i]);
		
		for(int i = 0; i < nums2.length; i++) {
			
			if(firstSet.contains(nums2[i])) {
				results.add(nums2[i]);
			}
		}
				
		int []intersection = new int[results.size()];
		
		Iterator<Integer> iterator = results.iterator();
		int k = 0;
        while (iterator.hasNext()) {
        	intersection[k] = iterator.next();
        	k++;
        }
		
		return intersection;
	}
}
