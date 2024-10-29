//dout
import java.util.Scanner;
public class ZigZagMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input number of rows and columns
        System.out.println("Enter the number of rows:");
        int N = sc.nextInt();
        System.out.println("Enter the number of columns:");
        int M = sc.nextInt();
        int[][] matrix = new int[N][M];
        // Input the matrix elements
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
            matrix[i][j] = sc.nextInt();
            }
        }
        printZigZag(matrix, N, M);
        sc.close();
        }
    public static void printZigZag(int[][] matrix, int N, int M) {
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                // Print left to right
                for (int j = 0; j < M; j++) {
                System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
            else {
                // Print right to left
                for (int j = M - 1; j >= 0; j--) {
                System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }
}