import java.util.*;
public class Addsub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows and Columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] x = new int[rows][cols];
        int[][] y = new int[rows][cols];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                y[i][j] = scanner.nextInt();
            }
        }
        int[][] C_add = new int[rows][cols];
        int[][] C_sub = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                C_add[i][j] = x[i][j] + y[i][j];
                C_sub[i][j] = x[i][j] - y[i][j];
            }
        }
        
        System.out.println("Matrix A:");
        printMatrix(x);
        
        System.out.println("Matrix B:");
        printMatrix(y);
        
        System.out.println("Matrix A + Matrix B:");
        printMatrix(C_add);
        
        System.out.println("Matrix A - Matrix B:");
        printMatrix(C_sub);
        
        scanner.close();
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
	}

}