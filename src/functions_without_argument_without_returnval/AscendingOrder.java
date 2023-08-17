package functions_without_argument_without_returnval;

import java.util.Scanner;

class AscendingPrg{
	int n;
	public void ascOrder() {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					a[i] = (a[i]+a[j])-(a[j]=a[i]);
				}
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

public class AscendingOrder {

	public static void main(String[] args) {
		
		AscendingPrg obj = new AscendingPrg();
		obj.ascOrder();

	}

}
