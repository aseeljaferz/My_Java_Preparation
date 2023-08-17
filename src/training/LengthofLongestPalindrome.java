package training;
import java.util.*;
public class LengthofLongestPalindrome {

	public static void main(String[] args) {
		String ch;
		int i,ans=0;
		Scanner in = new Scanner(System.in);
		ch = in.next();
		int f[]=new int [256];
		for(i=0;i<ch.length();i++) {
			f[ch.charAt(i)]+=1;
		}
		for(i=0;i<26;i++) {
			if(f[i]%2==0) {
				ans+=f[i];
			}
			else {
				if(f[i]>1) {
					ans+=(f[i]-1);
				}
			}
		}
		for(i=0;i<26;i++) {
			if(f[i]%2==0) {
				ans++;
				break;
			}
		}
	}
}
