package exception_handling;
import java.util.*;
public class Throw1 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("You are not eligible to vote");
		}
		else {
			System.out.println("You are eligible to vote");
		}
	}
	public static void main(String[] args) {
		try {
            validate(17);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Rest of the code...");
	}
}
