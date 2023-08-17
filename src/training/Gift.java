package training;
import java.util.*;
public class Gift {

	public static void main(String[] args) {
		int n,g,i,j;
		Scanner in= new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int[n];
		int ans[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++) {
			ans[i] = i+1;
		}
		int temp;
		for(i=0;i<n-1;i++) {
			for(j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					temp = ans[j];
					ans[j] = ans[j+1];
					ans[j+1] = temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
