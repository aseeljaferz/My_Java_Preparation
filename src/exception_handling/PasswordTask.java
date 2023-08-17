package exception_handling;
import java.util.*;
public class PasswordTask {
	
	public static String password="";
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		setPassword(in);
		boolean loggedIn = false;
		while(!loggedIn) {
			try {
				System.out.println("Enter your Password : ");
				String enterPassword = in.nextLine();
				if(authenticate(enterPassword)) {
					System.out.println("Logged in successfully!");
					loggedIn=true;
					break;
				}else {
					throw new InvalidPasswordException("Incorrect password. Please try again.");
				}
			}
			catch(InvalidPasswordException e) {
				 System.out.println(e.getMessage());
			}
		}
	}
	
	private static void setPassword(Scanner in) {
		while(password.isEmpty()) {
			System.out.print("Set your password: ");
			password=in.nextLine();
		}
	}
	
	private static boolean authenticate(String enterPassword) {
		return enterPassword.equals(password);
	}
	
	private static class InvalidPasswordException extends Exception {
        public InvalidPasswordException(String message) {
            super(message);
        }
    }
	
}
