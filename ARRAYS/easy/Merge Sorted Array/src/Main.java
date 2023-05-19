
public class Main {

	public static void main(String[] args) {
		
	/*	int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3;
		int n = 3;
		*/
		
		int[] nums1 = {0};
		int[] nums2 = {1};
		int m = 0;
		int n = 1;
		merge(nums1,m,nums2,n);
	}
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
		System.out.println("Welcome");
		int i = m-1; // -1
		int j = n-1; // 0.
		int k = (m + n) - 1; // 0
		
		
		while(j >= 0) {
			
			if(i>= 0 && nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				k--;i--;
			}else {
				nums1[k] = nums2[j];
				k--;j--;
			}
			
		}
		
		for(int num : nums1) {
			System.out.print(num+" ");
		}
    }
}
