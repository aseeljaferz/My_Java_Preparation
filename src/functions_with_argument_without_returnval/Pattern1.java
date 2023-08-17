package functions_with_argument_without_returnval;

import java.util.Scanner;

class PatternPrg1{
	public void patternPrg(int n, int i,int j) {
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				System.out.print(j);
				j++;
			}
			System.out.println();
			i++;   
		}
	}
}

public class Pattern1 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);

		int n = in.nextInt();
		int i=1,j=1;
		
		PatternPrg1 obj = new PatternPrg1();
		obj.patternPrg(n, i, j);
		
	}

}




