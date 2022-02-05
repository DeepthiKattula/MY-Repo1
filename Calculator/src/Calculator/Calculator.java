package Calculator;
import java.util.Scanner;
public class Calculator {
	
	  public static void main(String[] args) {

	    Scanner s=new Scanner(System.in);
	    boolean cnf=true;
	    do
	    {
	    	System.out.println("enter m,n values");
	    	int m=s.nextInt();
	    	int n=s.nextInt();
	    	System.out.println("1.Addition");
	    	System.out.println("2.Subtracton");
	    	System.out.println("3.Multiplication");
	    	System.out.println("4.Division");
	    	System.out.println("5.Modulous");
	    	System.out.println("Enter required option");
	    	int opt=s.nextInt();
	    	switch(opt)
	    	{
	    		case 1: 
	    			int Sum=m+n;
	    			System.out.println("Addition value : "+Sum);
	    			break;
	    			
	    		case 2: 
	    			int Sub=m-n;
	    			System.out.println("Subtraction value : "+Sub);
	    			break;
	    			
	    		case 3: 
	    			int Mul=m*n;
	    			System.out.println("Multiplication value : "+Mul);
	    			break;
	    			
	    		case 4: 
	    			int Div=m/n;
	    			System.out.println("Division value : "+Div);
	    			break;
	    			
	    		case 5: 
	    			int Mod=m%n;
	    			System.out.println("Modulous value : "+Mod);
	    			break;
	    		
	    			default:
	    				System.out.println("Invalid option");
	    	}
	    	System.out.println("Want to perform another option! Say (true/false)");
	    	cnf=s.nextBoolean();
	    }while (cnf);
	    
	  }
	}
