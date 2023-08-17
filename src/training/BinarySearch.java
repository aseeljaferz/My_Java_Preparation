package training;
import java.util.*;
public class BinarySearch {

	public static void main(String[] args) {
		int n,i;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int [n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		int x = in.nextInt();
		i=0; 
		int j=n-1;
		while(i<=j) {
			int mid=(i+j)/2;
			if(a[mid]==x) {
				System.out.print("Yes");
				break;
			}
			else if(a[mid]<x) {
				i=mid+1;
			}
			else {
				j=mid-1;
			}
		}
	}

}
