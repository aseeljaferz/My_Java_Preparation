package Arrays;
import java.util.*;
public class MultidimenArrayTranspose {

	public static void main(String[] args) {
		

		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		int a[][] = new int[n][n];
		int t[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Before Transpose : ");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				t[i][j] = a[j][i];
			}
		}
		
		System.out.println("After Transpose");
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(t[i][j]);
			}
			System.out.println();
		}

	}

}
