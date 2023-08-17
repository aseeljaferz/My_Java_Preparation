package doandfor;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		int fac=1;
		Scanner in = new Scanner (System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
			System.out.println(fac);
		}
		

	}

}
