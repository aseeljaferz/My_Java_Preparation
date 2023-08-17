package stacksANDqueues;
import java.util.*;
public class CountStrWithoutRepeat 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		Stack<Character> stack = new Stack<Character>();
		
		int count=0,i,j;
		String s= in.next();
		int ans=0;
		for(i=0;i<s.length()-1;i++) 
		{
			
			int freq[]=new int[26];
			for(int k=0;k<s.length();k++)
			{
				freq[k]=0;
			}
			for(j=i;j<s.length();j++) 
			{
				if(freq[s.charAt(j)-97]>0) 
				{
					break;
				}
				else
				{
					if(j-i+1>ans) 
					{
						ans=j-i+1;
					}
					freq[s.charAt(j)-97]++;
				}
			}
		}
		System.out.println(ans);
	}
}
