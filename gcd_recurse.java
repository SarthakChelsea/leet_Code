public class gcd_recurse {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);

    }
    public static void main(String args[]){
        System.out.print(gcd(48,18));
    }
}
