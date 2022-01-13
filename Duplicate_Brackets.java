import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {
    public static void main(String args[]){
        String s="(a+b)+(c+d)()";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.empty()&&st.peek()=='('&&s.charAt(i)==')'){
                    System.out.print("True");
                    break;
                }
            else if(!st.empty()&&st.peek()!='('&&s.charAt(i)==')'){
                while(st.peek()!='(') {
                    st.pop();
                }

                st.pop();
                }
            else
            {st.push(s.charAt(i));}
        }
        st.pop();

        if(st.empty())
            System.out.println("False");


        }
    }

