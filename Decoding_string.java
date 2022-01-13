public class Decoding_string {
    public static void main(String args[]){
        String s="leet2code3";
        String str="";
       for(int i=0;i<s.length();i++){
           char currChar=s.charAt(i);
           if(Character.isDigit(currChar)){
               for(int j=1;j>Character.getNumericValue(currChar)-1;j++)
                   str+=str;

           }
           else
               str+=s.charAt(i);
           System.out.println(str);
       }


    }
}
