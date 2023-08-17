package training;
import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		int n,i,j,temp=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int [n];
		for(i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(i=0;i<n;i++) {
			for(j=0;j<n-1-i;j++) {
				if(a[j]>a[j+1]) {                  
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
		for(i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
