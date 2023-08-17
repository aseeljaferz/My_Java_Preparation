package BetterTomorrow_tasks;
import java.util.*;
public class MaxMin {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int arr[]= new int[n];

		for(int i=0;i<n;i++)

		{

			arr[i] = sc.nextInt();

		}

		int a1[] = new int[n];

		int s=0,l=n-1;

		boolean flag=true;

		for(int i=0;i<n;i++)

		{

			if(flag) {

				a1[i]=arr[l--];

			}

			else{

				a1[i]=arr[s++];

			}

			flag=!flag;

			System.out.print(a1[i]+" ");

		}

	}

}
