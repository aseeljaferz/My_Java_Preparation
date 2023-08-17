package javaacademy;
import java.util.*;
public class Switch_arithmetic {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		char operator = in.next().charAt(0);
		
		switch(operator) {
		
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		
		}
		in.close();
	}

}
