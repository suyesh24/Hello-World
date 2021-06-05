package Day5;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please, Enter Your Email Id: ");
		String Email = scan.nextLine();
		Boolean regexMatched = Email.matches("^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
		if (regexMatched)
			System.out.println("Validation successfull");
		else
			System.out.println("Validation Failed Please Enter valid Email");

	}

}
