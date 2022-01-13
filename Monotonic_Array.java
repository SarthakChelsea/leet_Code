import java.util.Arrays;

public class Monotonic_Array {
    public static void main(String args[]){
        int asc=1;
        int desc=1;
        int[] nums={2,2,3,4};
        // to check if ascending order
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<=nums[i+1]){
                continue;

            }
            else{
                asc=0;
                break;
            }


        }
        //check if descending order
        for(int j=0;j<nums.length-1;j++){
            if(nums[j]>=nums[j+1]){
                continue;

            }
            else{
                desc=0;
                break;
            }

        }
        if(asc==1 || desc==1){
            System.out.println("monotonic");
        }
        else
            System.out.println("Unmonotonic");


    }
}
