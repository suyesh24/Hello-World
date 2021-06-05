package Day2;

import java.util.Scanner;

public class Operators {

	public Operators() {
		
	}

	public static void main(String[] args) {
		System.out.println("Arithmetic Operators are used below\n");
		
		int a = 50;
		int b = 20;
		
		int c = a+b;
		System.out.println("Addition of values : " + c);
		
		int d = a-b;
		System.out.println("Subtraction of values : " + d);

		int e = a*b;
		System.out.println("Multiplication of values : " + e);

		float f = a/b;
		System.out.println("Division of values : " + f);
		
		float g = a%b;
		System.out.println("Modulus values is : " + g);
		
		int h = a++;
		System.out.println("Value of increment  : " + a);
		
		float i = b--;
		System.out.println("Value of decrement  : " + b);
		
		
		System.out.println("\n\nAssingment Operators are used below\n");
		
		int j = a += b;
		System.out.println("Value of Add And operator : " + j);
		
		int k = a -= b; 
		System.out.println("Value of Subtract And operator : " + k);
		
		int l = a *= b;
		System.out.println("Value of Multiply And operator : " + l);
		
		int m = a /= b;
		System.out.println("Value of Divide And operator : " + m);
		
		int n = a %= b;
		System.out.println("Value of Modulus And operator : " + n );	
		
		
		/*Two types of Data Type:
		    * 1. Primitive - byte (1 byte), short (2 bytes), int(4 bytes), long(8 bytes), float(4 bytes)
		    * double (8 bytes), boolean(1  bit), char (2 bytes).\
		    * 
		    * 2. Non Primitive or Reference Data Type. 
		    */
		System.out.println("\n\n Data types are used below\n");
		   byte u = -70;
		   System.out.println(u);
		   double o = 80.9876d;
		   System.out.println(o);
		   char grade = 'C';
		   System.out.println(grade);
		    
		  //Taking user input in java
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Enter Input");
		    String input = scan.nextLine();
		    System.out.println(input);
					
	}
	
	}

