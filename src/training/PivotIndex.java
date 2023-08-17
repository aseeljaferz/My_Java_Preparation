package training;
import java.util.*;
public class PivotIndex {

	public static void main(String[] args) {
		int n,p,left=0,right=0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=in.nextInt();
		}
		for(int i=1;i<n;i++) {
			System.out.print(a[i]+" ");
			int stop=i;
			for(int start=0;start<stop;start++) {
				 System.out.println(a[start]);
				 break;
			}
		}
		
	}

}
//6
//1 7 3 6 5 6

//
//for(int i=0;i<n;i++) {
//	int count = 0;
//	if(count==0) {
//		for(int j=count+1;j<n;j++) {
//			right=right+a[j];
//		}
//	}
//	else {
//		for(int start=0;start<count;start++) {
//			left=left+a[start];
//		}
//
//		for(int j=count+1;j<n;j++) {
//			right=right+a[j];
//		}
//	}
//	if(right==left) {
//		System.out.println(i);
//		break;
//	}
//	count++;
//	
//}