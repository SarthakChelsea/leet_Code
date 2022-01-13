public class Decimal_binary_recurse {
    public static int tobinary(int dec){
        if(dec==0){
            return 0;
        }

        return dec%2+10* tobinary(dec/2);


    }
    public static void main(String args[]){
        System.out.println(tobinary(10));
       System.out.println( Integer.toBinaryString(10));

    }
}
