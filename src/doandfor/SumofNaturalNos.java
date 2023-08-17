package doandfor;

import java.util.Scanner;

public class SumofNaturalNos {

	public static void main(String[] args) {
		
		int n,i=1;
		int sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		n=in.nextInt();
		do   //exit controller loop
		{
			
			sum+=i;
			i++;
		}while(i<=n);  // entry controller loop
		System.out.println(sum);

	}

}
