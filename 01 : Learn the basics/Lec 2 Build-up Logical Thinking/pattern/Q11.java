import com.sun.org.apache.bcel.internal.generic.SWAP;

public class Solution {
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int k=0;
       int m=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%2==0)
                {
                    System.out.print(k +" ");
                    k=k^1;
                }
                else{
                    System.out.print(m +" ");
                    m=m^1;
                }
            }
            k=0;
            m=1;
            System.out.println();
        }
    }
}
