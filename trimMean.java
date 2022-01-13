import java.util.Arrays;

public class trimMean {
    public static void main(String args[]){
        int[] arr={1,2,6,5,3,4,5,6,7,8};
        Arrays.sort(arr);
        int x=(int)(0.05*arr.length);
        double sum=0.0;
        for(int i=x;i<arr.length-x;i++){
            sum=sum+arr[i];
        }
       System.out.print(sum/(arr.length-2*x));

    }
}
