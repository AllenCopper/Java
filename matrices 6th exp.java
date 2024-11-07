import java.util.Scanner;

public class MatrixAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner( System.in);
		
		int row, column;
		
		System.out.println( "Enter number of Rows in matrix :");
		row = sc.nextInt();
		
		System.out.println( "Enter number of Columns in matrix :");
		column = sc.nextInt();
		
		int mat1[][] = new int[row][column];
		int mat2[][] = new int[row][column];
		
		for ( int i = 0; i < row; ++i){
			for( int j = 0; j < column; ++j){
				System.out.println( "Enter "+ i + "th row and " + j+ "th column element of First Matrix :");
				mat1[i][j] = sc.nextInt();
			}
		}
		
		for ( int i = 0; i < row; ++i){
			for( int j = 0; j < column; ++j){
				System.out.println( "Enter "+ i + "th row and " + j+ "th column element of Second Matrix :");
				mat2[i][j] = sc.nextInt();
			}
		}
		
		System.out.println( "Addition of Two Matrices");
		for( int i =0 ; i < row; ++i){
			for( int j =0; j < column; ++ j){
				int temp = mat1[i][j] + mat2[i][j];
				System.out.print( temp + "  ");
			}
			System.out.println();
		}
	}

}