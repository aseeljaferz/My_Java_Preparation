package multilevel_inheritance;
class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class PrimePrinter extends PrimeChecker {
    public static void printPrimes(int start, int end) {;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
public class PrimeNos extends PrimePrinter {
	public static void main(String[] args) {
		 printPrimes(1, 100);
	}
}
