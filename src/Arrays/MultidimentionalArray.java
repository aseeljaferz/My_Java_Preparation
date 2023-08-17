package Arrays;
import java.util.*;
public class MultidimentionalArray {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		int a[][] = new int[n][n];
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<n;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}

	}

}
