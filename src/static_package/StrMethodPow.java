package static_package;
import java.util.*;
class Pow{
	
	public static double findPow(int n, int val) {
		int mul=1;
		for(int i=0;i<n;i++) {
			mul *= val;
		}
		return (double)mul;
	}
}
public class StrMethodPow {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int val=in.nextInt();
		double res=Pow.findPow(n, val);
		System.out.println(res);
	}
}
