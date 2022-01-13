import java.util.Arrays;
import java.util.Stack;

public class Next_Greater {
    public static void main(String args[]){
        int[] arr={7, 5, 2, 6, 4, 3, 8, 1, 5};
        Stack<Integer> st=new Stack<>();
        st.push(5);
        int [] nge=new int[arr.length];
        nge[nge.length-1]= -1;
        for(int i=arr.length-2;i>=0;i--){
            while (!st.empty()&&st.peek()<=arr[i]){
                st.pop();
            }
            if(st.empty())
                nge[i]= -1;
            else
               nge[i]=st.peek();

            st.push(arr[i]);
        }
        System.out.print(Arrays.toString(nge));


    }
}
