public class Solution {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int i=0;
        int j=1;
        while(i<A.length && j<A.length)
        {
            if(i!=j && A[j]-A[i]==B)
            {
                return 1;
            }
            else if(A[j]-A[i]<B)
            {
                j++;
            }
            else
            {
                i++;
            }
        }
        return 0;
    }
}
