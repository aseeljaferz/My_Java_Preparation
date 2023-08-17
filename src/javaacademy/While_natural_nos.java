package javaacademy;
import java.util.*;
public class While_natural_nos {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int i=0,t=0;
		int[] nums = new int[n+1];
		
		while(i<=n) {
			if(i==0) {
				i++;
			}
			nums[t++]=i;
			i++;
		}
		for(i=0;i<nums.length-1;i++) {
			System.out.print(nums[i]+" ");
		}
		
	}
}
