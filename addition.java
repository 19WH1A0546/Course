import java.io.*;
import java.util.*;

public class addition {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.println("Enter no of rows and columns of matrix: ");
        r = sc.nextInt();
        c = sc.nextInt();
        int[][] matrix1 = new int[r][c];
        int[][] matrix2 = new int[r][c];
        int[][] sum = new int[r][c];

        System.out.println("Enter matrix 1");
        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter matrix 2");
        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of Matrix 1 and Matrix 2:");
        for (int i = 0 ; i < r ; i++) {
            for(int j = 0 ; j < c ; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}