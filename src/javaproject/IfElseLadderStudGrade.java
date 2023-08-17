package javaproject;
import java.util.*;
public class IfElseLadderStudGrade {

	public static void main(String[] args) {
		
		int eng, tam, mat, phy, che, tot;
		double avg;
		String name, dept;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Enter name:");
		name = in.next();
		
		System.out.println("Class and Section:");
		dept = in.next();
		
		System.out.println("English Mark:");
		eng = in.nextInt();
		
		System.out.println("Tamil Mark:");
		tam = in.nextInt();
		
		System.out.println("Maths Mark:");
		mat = in.nextInt();
		
		System.out.println("Physics Mark:");
		phy = in.nextInt();
		
		System.out.println("Chemistry Mark:");
		che = in.nextInt();
		
		tot = eng+tam+mat+phy+che;
		
		avg = tot/5;
		
		System.out.println("");
		System.out.println("--------------------Student Mark List----------------------");
		System.out.println("");
		System.out.println("Name of the student : "+name);
		System.out.println("Class and Section   : "+dept);
		System.out.println("----------Marks----------");
		System.out.println("English Mark   :"+eng);
		System.out.println("Tamil Mark     :"+tam);
		System.out.println("Maths Mark     :"+mat);
		System.out.println("Physics Mark   :"+phy);
		System.out.println("Chemistry Mark :"+che);
		System.out.println("Total Mark     :"+tot);
		System.out.println("Average mark   :"+avg);
		
		if ( avg>=35 )
		{
			System.out.println("Student's grade:D");
		}
		
		else if (avg>=60)
		{
			System.out.println("Student's grade:C ");
		}
		
		else if (avg>=80)
		{
			System.out.println("Student's grade:B ");
		}
		
		else if (avg>=90)
		{
			System.out.println("Student's grade:A ");
		}
		
		if ( eng<=34 && tam<=34 && mat<=34 && phy<=34 && che<=34 && tot<250 && avg<=35 )
		{
			System.out.println("");
			System.out.println( name+" has Failed the exam");
		}
		else
		{
			System.out.println("");
			System.out.println( name+" has Passed the exam" );
		}

	}

}
