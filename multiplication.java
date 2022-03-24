import java.io.*;
import java.util.*;

public class multiplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r1, r2, c1, c2;
        System.out.println("Enter no of rows and columns of matrix 1:");
        r1 = sc.nextInt();
        c1 = sc.nextInt();
        System.out.println("Enter no of rows and columns of matrix 2:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();
        if (c1 == r2) {
            int[][] m1 = new int[r1][c1];
            int[][] m2 = new int[r2][c2];
            int[][] p = new int[r1][c2];
            System.out.println("Enter matrix 1:");
            for(int i = 0 ; i < r1 ; i++) {
                for(int j = 0 ; j < c1 ; j++) {
                    m1[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter matrix 2:");
            for(int i = 0 ; i < r2 ; i++) {
                for(int j = 0 ; j < c2 ; j++) {
                    m2[i][j] = sc.nextInt();
                }
            }

            for(int i = 0 ; i < r1 ; i++) {
                for(int j = 0 ; j < c2 ; j++) {
                    p[i][j] = 0;
                    for(int k = 0; k < c1 ; k++) {
                        p[i][j] += m1[i][k] * m2[k][j];
                    }
                }
            }

            System.out.println("Product: ");
            for(int i = 0 ; i < r1 ; i++) {
                for(int j = 0 ; j < c2 ; j++) {
                    System.out.print(p[i][j]+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("Invalid dimensions.");
        }
    }
}