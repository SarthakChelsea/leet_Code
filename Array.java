import java.util.Arrays;
import java.util.HashSet;

public class Array {
    public  static void main(String args[]){
        int[] arr={1,2,3,4,5,6,7,8,8,9,8,9};
        HashSet <Integer> set=new HashSet <Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int[] ans=new int[set.size()];
        int i=0;
        for(Integer j:set){
            ans[i++]=j;
        }
        System.out.print(ans.length);

    }}




