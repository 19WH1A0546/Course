import java.io.*;
import java.util.*;

class Prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Prime ob = new Prime();
        System.out.print("Enter a number: ");
        int n;
        n = sc.nextInt();
        if (ob.checkPrime(n)) {
            System.out.println(n+" is not a prime number.");
        }
        else {
            System.out.println(n+" is a prime number.");
        }
    }

    Boolean checkPrime(int n) {
        for(int i = 2 ; i < n/2+1 ; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }
}