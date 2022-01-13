public class Reverse_String_Of_words {
    public  static String reverse(String word){
        StringBuilder sb=new StringBuilder(word);
        return sb.reverse().toString();

    }
    public  static String reverseWords(String s) {
        String[] str=s.split(" ");
        for(int j=0;j<str.length;j++){
            str[j]=reverse(str[j]);
        }
        return str.toString(); }
    public static void main(String args[]){
       System.out.println(-(3^5));

    }
}

