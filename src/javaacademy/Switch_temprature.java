package javaacademy;
import java.util.*;
public class Switch_temprature {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("-----------Tempratur convertor----------");
		System.out.println();
		
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("2. Celsius to Fahrenheit");
		System.out.println("3. Celsius to Kelvin");
		System.out.println("4. Kelvin to Fahrenheit");
		System.out.println("5. Fahrenheit to Kelvin");
		System.out.println("6. Kelvi to Celsius");
		System.out.println();
		
		System.out.println("----------------------------------------");
		System.out.println();
		
		System.out.println("Choose from options:");
		int opt = in.nextInt();
		System.out.println();
		
		switch(opt) {
		
		case 1:
			System.out.println("Fahrenheit :");
			int f = in.nextInt();
			int c = (f-32)*(5/9);
			System.out.println("-----Fahrenheit to celsius-----");
			System.out.println("|                             |");
			System.out.println("|        Celsius :"+c+"       |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			break;
			
		case 2:
			System.out.println("Celsius :");
			c = in.nextInt();
			f = c*(9/5)+32;
			System.out.println("-----Celsius to Fahrenheit-----");
			System.out.println("|                             |");
			System.out.println("|      Fahrenheit :"+f+"      |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			break;
			
		case 3:
			System.out.println("Celsius :");
			c = in.nextInt();
			int k = (int) (c+273.15);
			System.out.println("-------Celsius to Kelvin-------");
			System.out.println("|                             |");
			System.out.println("|         Kelvin :"+k+"       |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			
		case 4:
			System.out.println("Fahrenheit :");
			k = in.nextInt();
			f = (int) (k-273.15)*(9/5)+32;
			System.out.println("------Kelvin to Fahrenheit-----");
			System.out.println("|                             |");
			System.out.println("|       Fahrenheit :"+f+"     |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			break;
			
		case 5:
			System.out.println("Fahrenheit :");
			f = in.nextInt();
			k = (int) ((f-32)*(5/9)+273.15);
			System.out.println("-------Celsius to Kelvin-------");
			System.out.println("|                             |");
			System.out.println("|         Kelvin :"+k+"       |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			break;
			
		case 6:
			System.out.println("Kelvin :");
			k = in.nextInt();
			c = (int) (k-273.15);
			System.out.println("-------Celsius to Kelvin-------");
			System.out.println("|                             |");
			System.out.println("|        Celsius :"+k+"       |");
			System.out.println("|                             |");
			System.out.println("-------------------------------");
			break;
			
		default:
			System.out.println();
			System.out.println(" Worng Input!! ");
			break;
		
		}

	}

}
