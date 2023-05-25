import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		int[] nums1 = new int[6];
		nums1[0] = 0;
		nums1[1] = 1;
		nums1[2] = 2;
		nums1[3] = 4;
		nums1[4] = 5;
		nums1[5] = 7;
		
		int[] nums2 = new int[7];
		nums2[0] = 0;
		nums2[1] = 2;
		nums2[2] = 3;
		nums2[3] = 4;
		nums2[4] = 6;
		nums2[5] = 8;
		nums2[6] = 9;
		
		List<String> res = null;
		
		res = summaryRanges(nums1);
		
		for(String r : res) {
			System.out.print(r+" ");
		}
		
		
		res = summaryRanges(nums2);
		
		for(String r : res) {
			System.out.print(r+" ");
		}
	}
	
	public static List<String> summaryRanges(int[] nums){
		
		return null;
	}

}
