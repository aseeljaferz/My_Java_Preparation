package patterns;
import java.util.*;
public class PatternWhile1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		int n=in.nextInt();
		
		int i=1,j=1;
		
		while(i<=n) {
			j=1;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
