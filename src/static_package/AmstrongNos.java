package static_package;
import java.util.*;
class Armstrong{
	public static void armstrNos(int n) {
		int num = n;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        if(sum == n) {
        	System.out.println("Armstrong nos");
        }else {
        	System.out.println("not Armstrong nos");
        }
	}
}
public class AmstrongNos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		Armstrong.armstrNos(n);
	}
}
