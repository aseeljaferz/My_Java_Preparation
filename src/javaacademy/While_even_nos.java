package javaacademy;
import java.util.*;
public class While_even_nos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		int n=in.nextInt();
        int i=0;
//		int[] even = new int[n];
//		int e=0;
//		int[] odd = new int[n];
//		int o=0;
		
		while(i<=n) {
			
			if(i%2==0) {
				System.out.println("Even="+i);
			}
			i++;
			
		}
		System.out.println();
		i=1;
		while(i<=n) {
			
			if(i%2!=0) {
				System.out.println("odd="+i);
			}
			i++;
			
		}
	//	System.out.print("Even nos :");
//		for(i=0; i<even.length-1; i++) {
//			if(even[i]==0) {
//				break;
//			}
//			System.out.print(even[i]+" ");
//		}
//		System.out.println();
//		
//		System.out.println();
//		System.out.print("Odd nos :");
//		for(int j=0; j<even.length-1; j++) {
//			if(odd[j]==0) {
//				break;
//			}
//			System.out.print(odd[j]+" ");
//		}
		
	}

}
