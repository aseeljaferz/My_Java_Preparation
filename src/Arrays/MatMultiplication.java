package Arrays;

import java.util.*;

public class MatMultiplication {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int b[][] = new int[n][n];
		int c[][] = new int[n][n];
		
		int rows = a.length;
		int cols = a[0].length;		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				b[i][j] = in.nextInt();
			}
		}
		System.out.println("Matrix 1 : ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Matrix 2 : ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				c[i][j]=0;
				for(int k=0; k<n; k++) {
					c[i][j] += a[i][k]*b[k][j];
				}
			}
		}
		
		System.out.println("Multiplied Matrix : ");
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}

//3+8+7 = 18


