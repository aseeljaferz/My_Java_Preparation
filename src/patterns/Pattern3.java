package patterns;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		int i=1,j=1;
		
		while(i<=n) {
			j=1;
			while(j<=n) {
				if(i+j<=5) {
					System.out.print(" ");
				}
				else {
					System.out.print(i);
				}
				j++;			
			}
			System.out.println();
			i++;
		}
		

	}

}


//    1
//   22
//  333
// 4444
//55555