import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create 2D arrays for matrices
        int[][] arr1, arr2, arr3;
        
        // Define row and column sizes
        int r1, r2, c1, c2;
        
        // Accept size of both arrays
        System.out.print("Enter the number of rows for matrix 1: ");
        r1 = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix 1: ");
        c1 = scanner.nextInt();
        System.out.print("Enter the number of rows for matrix 2: ");
        r2 = scanner.nextInt();
        System.out.print("Enter the number of columns for matrix 2: ");
        c2 = scanner.nextInt();
        
        // Check if sizes are compatible for addition
        if (r1 != r2 || c1 != c2) {
            System.out.println("Addition cannot be done due to size mismatch.");
            return;
        }
        
        // Create matrices with the specified sizes
        arr1 = new int[r1][c1];
        arr2 = new int[r2][c2];
        arr3 = new int[r1][c1];
        
        // Accept elements of the first matrix
        System.out.println("Enter elements for matrix 1:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }
        
        // Accept elements of the second matrix
        System.out.println("Enter elements for matrix 2:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j] = scanner.nextInt();
            }
        }
        
        // Perform matrix addition
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        
        // Display the matrices
        System.out.println("Matrix 1:");
        displayMatrix(arr1);
        System.out.println("Matrix 2:");
        displayMatrix(arr2);
        System.out.println("Resultant Matrix:");
        displayMatrix(arr3);
    }
    
    // Function to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
