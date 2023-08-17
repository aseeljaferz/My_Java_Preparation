package method_overloading;
import java.util.*;

class StringRev{
    public void testReverse(String str) {
        String[] s = str.split(" ");
        String rev = "";
        for(int i = s.length - 1; i >= 0; i--) {
            rev += s[i] + " ";
        }
        System.out.println(rev.substring(0, rev.length() - 1));
    }

    public void testReverse(int n, String str) {
        String[] s = str.split(" ");
        String rev = "";
        for(int i = n-1; i >= 0; i--) {
            rev += s[i] + " ";
        }
        for(int i = n; i < s.length; i++) {
            rev += s[i] + " ";
        }
        System.out.println(rev.substring(0, rev.length() - 1));
    }
}

public class StrRev {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character after reading the integer
        String str = in.nextLine();
        StringRev obj = new StringRev();
        obj.testReverse(str);
        obj.testReverse(n, str);
    }
}