import java.util.Arrays;

public class Median_of_two_Arrays {
    public static void main (String Args[]){
        int[] arr={1,2,3,4,5};
        int[] arr1={1,8,7};

        int[] merge=new int[arr.length+ arr1.length];
        for(int i=0;i<arr.length+arr1.length;i++){
            if(i<arr.length){
                merge[i]=arr[i];
            }
            else{
                merge[i]=arr1[i- arr.length];
        }}            Arrays.sort(merge);

            System.out.print(Arrays.toString(merge));
            double median;
            int n=merge.length;
        if(n%2==0){
            median=((merge[(n-1)/2])+(merge[(n+1)/2]))/2.0;
        }
        else
            median=(merge[n/2]);
        System.out.println(median);
        System.out.println(Integer.parseInt("11",2));

    }
}
