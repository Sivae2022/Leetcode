class Solution {
    public int[] asteroidCollision(int[] arr) {
        
               Stack <Integer> st=new Stack<>();
               int n=arr.length;
               for(int i=0;i<n;i++)
               {
                if(arr[i]>0)
                {
                    st.push(arr[i]);
                }
                else{
                    while(!st.isEmpty() && st.peek()<Math.abs(arr[i]) && st.peek()>0 )
                    {
                        st.pop();
                    }
                    if(!st.isEmpty()  && st.peek()==Math.abs(arr[i]) && st.peek()>0)
                    {
                        st.pop();
                    }
                    else if(st.isEmpty() || st.peek()<0)
                    {
                            st.push(arr[i]);
                    }
                }
               }
                int m=st.size();
               int [] ans=new int[m];
               for(int i=m-1;i>=0;i--)
               {
                ans[i]=st.pop();
               }
               return ans;

    }
}