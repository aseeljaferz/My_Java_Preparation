package doandfor;

import java.util.Scanner;

public class SumofFactorial {

	public static void main(String[] args) {
		
		int fac=1;
		int sum=0;
		Scanner in = new Scanner (System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
			fac=fac*i;
			sum += fac;
		}
		
		System.out.println(sum);
			
	}

}
