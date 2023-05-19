
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[5];
		nums[0] = 4;
		nums[1] = 1;
		nums[2] = 2;
		nums[3] = 1;
		nums[4] = 2;
		System.out.println(singleNumber(nums));
	}
	
	public static int singleNumber(int[] nums) {
        boolean res = false;
        int num;
        for(int i = 1; i < nums.length; i++){

            for(int j = 0; j < nums.length; j++){

                if(nums[i] == nums[j] && i != j){ 
                    break;
                }else{
                    res = true;
                }
            }

            if(res == true){
                return nums[i];
            }
        }

        return -1;
    }

}
