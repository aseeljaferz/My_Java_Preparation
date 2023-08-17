package Arrays;

import java.util.*;

public class MultidimenIdentity {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		int row = a.length;
		int col = a[0].length;
		boolean f = true; 
		
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		if(row != col) {
			System.out.println("not an identity matrix");
		}
		else {
			for(int i=0; i<row; i++) {
				for(int j=0; j<col; j++) {
					if(i==j && a[i][j]!=1) {
						f = false;
						break;
					}
					if(i!=j && a[i][j]!=0) {
						f = false;
						break;
					}
				}
			}
			if(f) {
				System.out.println("It is a identity matrix");
			}
			else {
				System.out.println("not an identity matrix");
			}
		}

	}

}
