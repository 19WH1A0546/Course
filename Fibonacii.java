import java.io.*;
import java.util.*;

class Fibonacii {
    public static void main(String args[]) {
        Fibonacii ob = new Fibonacii();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n;
        n = sc.nextInt();

        int t1 = 0;
        int t2 = 1;
        int t3;

        System.out.println("Fibonacii Series: ");
        System.out.print(t1+" "+t2+" ");

        for (int i = 0 ; i < n-2 ; i++) {
            t3 = t1 + t2;
            System.out.print(t3+" ");
            t1 = t2;
            t2 = t3;
        }
    }
}