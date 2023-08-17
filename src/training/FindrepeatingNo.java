package training;
import java.util.*;
public class FindrepeatingNo {

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int [n+1];
		for(int i=0;i<n+1;i++) {
			a[i]=in.nextInt();
		}
		int freq[]=new int[n+1];
		for(int i=0;i<n+1;i++) {
			freq[i]=0;
		}
		for(int i=0;i<a.length;i++) {
			freq[ a[i] ] += 1;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]>1) {
				System.out.print(i);
			}
		}
	}
}
