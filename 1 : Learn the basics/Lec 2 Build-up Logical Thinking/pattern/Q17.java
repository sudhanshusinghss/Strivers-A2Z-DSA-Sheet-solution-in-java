public class Solution {
    public static void alphaHill(int n) {
        char k='A';
       for(int i=1;i<=n;i++)
       {
           for(int j=1;j<=n-i;j++)
           {
               System.out.print(' ');
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print(k +" ");
               k++;
           }
           k--;
           for(int j=1;j<i;j++)
           {
               k--;
               System.out.print(k +" ");
               
           }
           System.out.println();
            k='A';
       }
    }
}
