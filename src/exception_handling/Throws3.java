package exception_handling;
import java.io.*;  
class DemoThrow3{  
	void method()throws IOException{  
		System.out.println("device operation performed");  
	}  
} 
public class Throws3 {
	public static void main(String[] args) throws IOException {
		DemoThrow3 m=new DemoThrow3();  
	    m.method();  
	    System.out.println("normal flow...");  
	}
}
