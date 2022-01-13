import java.util.*;
public class Stock_Span {
    public static void main(String args[]){
        int[] arr={2,3,4,57,6,5,9};
        int[] ans=new int[arr.length];
        Stack <Integer> st=new Stack<>();
        st.push(0);
        ans[0]=1;
        for(int i=1;i<arr.length;i++)
        {while(!st.empty()&&arr[st.peek()]<arr[i])
        {
            st.pop();
        }
            if(st.size()==0)
            {
                ans[i]=i+1;
            }
            else
            {
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.print(Arrays.toString(ans));
    }
}
