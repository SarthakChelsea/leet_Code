import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Remove_Duplicate_Arrays {
    public static void main(String args[]){
        int[] arr={1,1,1,1,1,3,3,3,4,4,5};
        int count=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]!=arr[i-1]){
                arr[count]=arr[i];
                count++;}
        }


        int[] arr1={1,3,4};

        System.out.println(Arrays.compare(arr,arr1));



    }
}
