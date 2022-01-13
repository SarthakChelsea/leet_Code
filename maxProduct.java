public class maxProduct {
    public static int maxProduct(int[] nums) {
        int max=-1;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if((nums[i]-1)*(nums[j]-1)>max){
                    max=(nums[i]-1)*(nums[j]-1);
                }

            }

        }


        return max; }
    public static void main(String args[]){
        int y=maxProduct(new int[]{3, 4, 5, 2});
        System.out.println(y);
    }
}
