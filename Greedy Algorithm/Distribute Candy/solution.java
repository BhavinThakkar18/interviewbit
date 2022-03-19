public class Solution {
    public int candy(int[] A) {
        int n= A.length;
         
        int[] left=new int[n];
        int[] right=new int[n];
        Arrays.fill(left,1);
        Arrays.fill(right,1);
        // assigning the values from left
        for(int i=1;i<n;i++)
        {
            if(A[i]>A[i-1])
            {
                left[i]=left[i-1]+1;
            }
        }
       // assigning the values from right
        for(int j=n-2;j>=0;j--)
        {
            if(A[j]>A[j+1])
            {
                right[j]=right[j+1]+1;
            }
        }
        int ans=0;
        // taking maximum of both the values
        for(int i=0;i<n;i++)
        {
            ans+=Math.max(left[i],right[i]);
        }
        return ans;
    }
}
