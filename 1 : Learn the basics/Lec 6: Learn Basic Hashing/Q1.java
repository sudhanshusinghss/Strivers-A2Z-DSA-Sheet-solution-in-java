public class test {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();

        int[] arr=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("enter " +i+"th number of array");
            arr[i]=sc.nextInt();;
        }

        int[] arr1=new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            arr1[arr[i]]++;
        }

        System.out.println("enter number");
        int a=sc.nextInt();
        System.out.println(arr1[a]);

    }
}
