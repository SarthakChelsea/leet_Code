public class smallestEqual {
    public static int smallestEqual(int[] nums) {
        int val=1000;
        for(int i=0;i<nums.length;i++){
            if(i%10==nums[i]){
                if(i<val){
                    val=i;
                }
            }

        }
        if(val==1000)
            return -1;
        else
            return val;

    }
}
