package training;
import java.util.*;
public class DiffMinandMax {
	

	public static void main(String[] args) {
		int n,i,j,k;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		k = in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(i=0;i<n-1;i++) {
			for(j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					a[i]=(a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		int ans=Integer.MAX_VALUE;
		for(i=0;i<n-k;i++) {
			int min=a[i];
			int max=a[i+k-1];
			int dif=max-min;
			if(dif<ans) {
				ans=dif;
			}
		}
		System.out.println(ans);
		
	}
}
