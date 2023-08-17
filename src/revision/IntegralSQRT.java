//given an integer find the integral sqrt of the number
//time complexity - O(root n)


package revision;
import java.util.*;
public class IntegralSQRT {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int answer=sqrt(n);
		System.out.println(answer);
		}
	static int sqrt(int n) {
		int i=0;
		while(i*i<=n) {
			if(i*i==n) {
				return i;
			}
			i++;
		}
		return i-1;
	}

}
