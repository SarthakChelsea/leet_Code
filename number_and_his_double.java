public  class number_and_his_double {
    public static void main(String args[]){
    int arr[]={1,2,3,4,6,5,6,4,5,6,7,8};
    int check=0;
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(i==j){
                continue;
            }
            else{
                if(arr[i]==2*arr[j]){
                    check=1;
                    break;}
            }
        }
    }
        System.out.println(check);
}}
