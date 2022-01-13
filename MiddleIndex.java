public class MiddleIndex {
    public static void main(String args[]){
        int sum = 0;
        int[] nums={1,2,3,4,5,9};
        for(int n=0;n<nums.length;n++) {
            sum +=n;
        }
        int left = 0;
        int right;
        for(int i=0; i<nums.length; i++) {
            right = sum - nums[i] - left;
            if(left == right) {
                System.out.print(i);
                break;
            }
            left = left + nums[i];
        }

    }
}
