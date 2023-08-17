package training;
import java.util.*;
public class Chalk {

	public static void main(String[] args) {
		int n,i;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int k = in.nextInt();
		int a[] = new int [n];
//		for(i=0;i<n;i++) {
//			a[i]=in.nextInt();
//		}
//		i=0;
//		while(k>=0) {
//			k=k-a[i];
//			if(k==0) {
//				System.out.println((i+1)%n);
//				break;
//			}
//			if(k<0) {
//				System.out.println(i%n);
//				break;
//			}
//		}
		
		
		//                or
		int sum=0;
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
			sum=sum+a[i];
		}
		k=k%sum;
		for(i=0;i<n;i++) {
			k=k-a[i];
			if(k==0) {
				System.out.println(i+1);
				break;
			}
			if(k<0) {
				System.out.println(i);
				break;
			}
			i++;
			if(i==n) {
				System.out.println();
			}
		}
		
		

	}

}
