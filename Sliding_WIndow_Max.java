import java.util.Arrays;
import java.util.*;

public class Sliding_WIndow_Max {
    public static void main(String args[]){
        int[] arr= {7, 5, 2, 6, 4, 3, 8, 1, 5};
        int k=4;


        int j;
        for( j=0;j<arr.length-k;j++){
            int max=0;
            int[] arr1=Arrays.copyOfRange(arr, j,j+k);
            System.out.print("[");
            for (int i = 0; i < arr1.length; i++) {
                if (max < arr1[i])
                    max = arr1[i];
                System.out.print(arr1[i]);
            }
            System.out.print("]");

            System.out.print("\t"+"Max:"+max+"\t");
            System.out.println();

        }
    }
}
