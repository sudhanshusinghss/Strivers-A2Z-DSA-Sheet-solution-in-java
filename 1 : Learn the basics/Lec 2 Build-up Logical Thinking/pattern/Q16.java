public class Solution {
    public static void alphaRamp(int n) {
         char k='A';
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k +" ");
            }
            System.out.println();
            k++;
        }
    }
}
