package javaproject;
import java.util.*;
public class ProfitorLoss {

	public static void main(String[] args) {
		
		double cp, sp, profit, loss;
		Scanner in = new Scanner ( System.in );
		
		System.out.println( "Enter the Cost Price of the Product:" );
		cp = in.nextDouble();
		
		System.out.println( "Enter the Selling Price of the Product:" );
		sp = in.nextDouble();
		
		
		if ( sp>cp )
		{
			profit = sp-cp;
			System.out.println("The Profit is "+profit );
		}
		
		else
		{
			loss = cp-sp;
			System.out.println("The loss is "+loss);
		}

	}

}
