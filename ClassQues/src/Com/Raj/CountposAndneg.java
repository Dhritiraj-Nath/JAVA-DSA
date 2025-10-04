package Com.Raj;
import java.util.Scanner;

public class CountposAndneg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[]arr = new int[n];
        System.out.println("enter the number of elements : ");
        for (int i = 0; i < n; i++) {
            arr[i]  = in.nextInt();
        }
        
    }
}
