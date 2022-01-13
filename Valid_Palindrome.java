public class Valid_Palindrome {
    public static void main(String args[]){
        String s="A man";
        int a=1;
       s= s.toLowerCase();

       s= s.replaceAll("\\s","");
        s=s.replaceAll("\\p{Punct}","");
       System.out.println(s);
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)-sb.reverse().charAt(i)!=0) {
                a = 0;
                break;
            }

        }
        System.out.println(a);


    }
}
