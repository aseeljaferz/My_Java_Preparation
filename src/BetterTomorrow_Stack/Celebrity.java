package BetterTomorrow_Stack;
import java.util.*;
public class Celebrity {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[][] = new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0; j<n;j++) {
				arr[i][j] = in.nextInt();
			}
		}
		
		Stack<Integer> s = new Stack<>();
		
		for(int i=0; i<n; i++) {
			s.push(i);
		}
		while(s.size()>1) {
			int a = s.pop();
			int b = s.pop();
			if(arr[a][b] == 1) {
				s.push(b);
			}else if(arr[b][a]==1){
				s.push(a);
			}
		}
		int c = s.peek();
		int flag = 1;
		for(int i=0; i<n; i++) {
			if(arr[i][c] == 1 && i!=c) {
				flag = -1;
				System.out.print("no celeb");
				break;
			}
			if(arr[i][c] == 0 && i!=c) {
				flag = -1;
				System.out.print("no celeb");
				break;
			}
		}
		if(flag == 1) {
			System.out.print("celeb is there");
		}

	}

}
