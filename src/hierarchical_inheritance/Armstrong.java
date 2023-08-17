package hierarchical_inheritance;
class ArmstrongChecker {
    public static boolean isArmstrong(int number) {
        int num = number;
        int numDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numDigits);
            num /= 10;
        }

        return sum == number;
    }
}

class ArmstrongPrinter extends ArmstrongChecker {
    public static void printArmstrongs(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
public class Armstrong extends ArmstrongChecker {

	public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }

	}

}
