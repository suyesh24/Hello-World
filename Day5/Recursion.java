package Day5;

public class Recursion {

	public static void main(String[] args) {
		recursiveFuncion2(10);
	}

	static void recursiveFuncion (int i) {
		if (i <= 0)
			return;
		else {
			i--;
			System.out.println(i);
			recursiveFuncion(i);   //Tail Recursion
			
			
			
		}
	}
	
	
	static void recursiveFuncion2 (int i) {
		if (i > 0) {
			i--;
			System.out.println(i);
			recursiveFuncion2(i); //Head Recurtion
			
		}
		else {
			return;
			
			
			
			
		}
	}
	
}
