public class Palindrome {

    public static boolean isPalindrome(int x) {
        int result=0;
        int normal=x;
        while(x>0){
            result=result*10+(x%10);
            x=x/10;
        }
        if(x<0)
            return false;
        else
            return result==normal;


    }



    public static void main(String args[]){
        System.out.println(isPalindrome(-222));


    }
}
