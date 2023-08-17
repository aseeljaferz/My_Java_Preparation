package exception_handling;
import java.util.*;
public class CustomMessage {
	public static void main(String[] args) {
		try  
    	{  
        	int data=50/0; 
        }  
        catch(Exception e)  
        {  
            System.out.println("Can't divided by zero");  
        }  
	}
}
