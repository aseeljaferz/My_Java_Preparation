//package revision;
//import java.util.*;
//public class Pangram {
//
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String ch = in.next();
//		int i;
//		int f[]=new int[26];
//		for(i=0;i<ch.length();i++) {
//			f[ch.charAt(i)-97]+=1;
//		}
//		int count = 0;
//		for(i=0;i<f.length;i++) {
//			if(f[i]>0) 
//				count++;
//		}
//		if(count==26)
//			System.out.println("Pangram");
//		else
//			System.out.println("Not a Pangram");
//		
//	}
//
//}
//
//
///*
//
//pangramclass Solution { 
//	public boolean checkIfPangram(String sentence) 	{
//		int a[]=new int[26]; 
//		int n=sentence.length();
//		for(int i=0;i<n;i++) {
//			a[sentence.charAt(i)-97]+=1;
//		} 
//		int count=0; 
//		for(int i=0;i<a.length;i++) { 
//			if(a[i]>0) 
//				count++; 
//		} 
//		if(count==26) 
//			return true; 
//		return false; 
//	} 
//}
//
//*/