import java.util.ArrayList;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
		int[] intersection = null;
		int[] nums1 = new int[4];
		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 2;
		nums1[3] = 1;
		
		int[] nums2 = new int[2];
		nums2[0] = 2;
		nums2[1] = 2;
		
		intersection = intersection(nums1, nums2);
		for(int inter : intersection) {
			System.out.print(inter+" ");
		}
		
		
	}
	
	public static int[] intersection(int[] nums1, int[] nums2) {
		
		List<Integer> results = new ArrayList<>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i = 0;
		int k = 0;
		
		
		while(i < nums1.length && k < nums2.length) {
			
			if(nums1[i] == nums2[k]) {
				results.add(nums1[i]);
				k++;i++;
			}else if( nums1[i] < nums2[k]) {
				i++;
			}else if( nums1[i] > nums2[k]) {
				k++;
			}
			
		}
		
		
		int []intersection = new int[results.size()];
		
		i = 0;
		for(int num : results)
			intersection[i++] = num;
		
		
		return intersection;
	}
}
