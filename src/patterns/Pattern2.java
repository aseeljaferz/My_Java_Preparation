package patterns;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {

		Scanner in = new Scanner (System.in);
		
		int n = in.nextInt();
		
		int i=1,j=1;
		
		while(i<=n)
		{
			j=1;
			while(j<=n)
			{
				if(i+j<=n)
				{
					System.out.print(" ");
				}
				else {
					System.out.print(j);
				}
				j++;
				
			}
			System.out.println();
			i++;
		}

	}

}

    
 

