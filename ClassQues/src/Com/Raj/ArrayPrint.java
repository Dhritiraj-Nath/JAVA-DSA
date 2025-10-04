package Com.Raj;
import java.util.Scanner;
public class ArrayPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
            System.out.println(arr[i]);
        }
    }
}


