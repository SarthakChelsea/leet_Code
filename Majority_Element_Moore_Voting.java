public class Majority_Element_Moore_Voting {
    public static void main(String args[]){
        int arr[]={1,4,4,4,4,4,5,9};
        int count=1;
        int index=0;
        for(int i=1;i<arr.length;i++){
            ;
            if(arr[index]==arr[i]){
                count++;
            }else
                count--;
            if(count==0)
            {
                index=i;
                count=1;
            }

        }
        count=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]==arr[index])
                count++;
        }
        int ans=count>(arr.length/2)?(arr[index]):-1;
        System.out.print(ans);
    }
}
