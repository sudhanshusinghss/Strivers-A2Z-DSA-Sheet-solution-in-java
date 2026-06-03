public class Solution {
    public static void alphaTriangle(int n) {
        char k=(char)(int)('A'+n-1);
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=i;j++)
           {
               
               System.out.print(k +" ");
               k--;
               
           }
           System.out.println();
           k=(char)(int)('A'+n-1);
       }
    }
}
