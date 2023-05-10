import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] firstArray = {1};        //source array
        int[] secondArray = {2};
        findMedianSortedArrays(firstArray,secondArray);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int length1 = nums1.length;
        int length2 = nums2.length;

        int[] result = new int[length1 + length2];
        System.arraycopy(nums1,0,result,0,length1);
        System.arraycopy(nums2,0,result, length1,length2);

        Arrays.sort(result);

        double median = 0.0;
        if(result.length % 2 != 0)
            median = result[((0+result.length) / 2)];

        else if(result.length == 2)
            median = result[0] + result[1];
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);
        System.out.println((0+result.length)/2);
        System.out.println(median);
        return 0;
    }
}
