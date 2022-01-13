public class Ascending_Order_of_String {
    public static void main(String args[]){
        String s="1 box has 100 blue 4 red 6 green and 12 yellow marbles";
        String[] arr=s.split(" ");
        int k=0;

        for(int i=0;i<arr.length;i++){
            String currWord=arr[i];
           if(Character.isDigit(currWord.charAt(0))){
               if(Integer.parseInt(currWord)>k){
                   k=Integer.parseInt(currWord);

               }
               else{System.out.println("False");
               break;}

           }}





        }
    }


