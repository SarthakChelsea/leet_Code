import java.util.Arrays;

public class largestAreaTriangle {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int  val=0;
        for(int i=nums.length-1;i>1;i--){
            if(nums[i]<nums[i-1]+nums[i-2])
                if(nums[i]+nums[i-1]+nums[i-2]>val)
                { val=nums[i]+nums[i-1]+nums[i-2];
                    break;
                }
        }
        return val;



    }
}
