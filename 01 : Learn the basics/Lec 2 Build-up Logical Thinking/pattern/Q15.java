public class Solution {
    public static void nLetterTriangle(int n) {
        char k='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(k +" ");
                k++;
            }
            System.out.println();
            k='A';
        }
    }
}
