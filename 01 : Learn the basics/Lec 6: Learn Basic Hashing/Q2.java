
import java.util.Scanner;


public class test {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int temp='a';

        int[] arr1=new int[26];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            arr1[s.charAt(i)-'a']++;
        }

        System.out.println("enter latter");
        char c = sc.next().charAt(0);
        System.out.println(arr1[c-'a']);

    }
}
