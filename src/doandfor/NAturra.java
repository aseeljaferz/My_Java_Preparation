package doandfor;

import java.util.*;

public class NAturra {
	public static void main(String arg[])
	{
		int n,i=1;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		n=in.nextInt();
		do   //exit controller loop
		{
			System.out.println(i);
			i++;
		}while(i<=n);  // entry controller loop
	}
}
