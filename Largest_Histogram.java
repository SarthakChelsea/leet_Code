import java.util.Arrays;
import java.util.Stack;

public class Largest_Histogram {
    public static void main(String args[]){
        int[] arr={6,2,5,4,5,1,6};
        int[] right=new int[arr.length];
        int[] left=new int[arr.length];
        int n= arr.length;
        //nse on the right
        Stack<Integer> st=new Stack<>();
        st.push(n-1);
        right[n-1]=n;
        for(int i=n-2;i>0;i--){
            while(st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                right[i]=n;
            }
            else
                right[i]=st.peek();
            st.push(i);
        }
        //nse on left
        st.clear();
        st.push(0);
        left[0]=-1;
        for(int i=1;i<n;i++){
            while(st.size()>0&&arr[i]<=arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                left[i]=-1;
            }
            else
                left[i]=st.peek();
            st.push(i);
        }
        int maxArea=0;
        for(int i=0;i<n;i++){
            int width=right[i]-left[i]+1;
            int area=arr[i]*width;
            if(area>maxArea)
                maxArea=area;
        }
        System.out.print(maxArea);

    }
}
