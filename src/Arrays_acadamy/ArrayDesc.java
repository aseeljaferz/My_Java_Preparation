package Arrays_acadamy;
import java.util.*;
public class ArrayDesc {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		int a[] = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n;j++) {
				if(a[i]<a[j]) {
					a[i] = (a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]);
		}

	}

}
