public class Solution {
    public static void numberCrown(int n) {
       int k=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
                
            }
              k=i;
            
            for(int j=1;j<=i;j++)
            {
                
                System.out.print(k +" ");
                k--;
            }
            System.out.println();
        }
    }
}
