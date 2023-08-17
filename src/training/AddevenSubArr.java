package training;
import java.util.*;
public class AddevenSubArr {

	public static void main(String[] args) {
		int n,i;;
		int sum=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int[n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++) {
			if(a[i]%2==0) {
				sum+=(i+1);
			}
		}
		System.out.println(sum);
	}

}
