public class Sorting_The_Sentence {
    public static void main(String args[]){
        String s="is2 sentence4 This1 a3";
        String[] arr=s.split(" ");
        String[] words=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String currWord=arr[i];
            words[currWord.charAt(arr[i].length()-1)-'1']=currWord.substring(0,currWord.length()-1);
        }
       String res="";
        for(int j=0;j< words.length;j++){
            res=res+" "+words[j];
        }
        System.out.println(res);



    }
}
