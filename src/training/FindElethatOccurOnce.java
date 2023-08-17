package training;
import java.util.*;
public class FindElethatOccurOnce {

	public static void main(String[] args) {
		int n,i,j;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int [n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int ans=0;
		for(i=0;i<n;i++) {
			ans=ans^a[i];
		}
		System.out.println(ans);
	}

}
