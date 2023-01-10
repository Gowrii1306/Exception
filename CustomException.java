package exceptionsHandling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args)  {
		System.out.println("Enter Your Name:");
		Scanner name = new Scanner(System.in);
		String name1 = name.nextLine();
		System.out.print("Enter Your Age:");
		Scanner as = new Scanner(System.in);
		int age = as.nextInt();
		try {
		if(age>=18) {
			System.out.println("Eligible to Vote");
		}
		else {
			throw new AgeException("Not Eligible");
		}
		}
		catch (Exception c) {
			System.err.println("Not Eligible to Vote");
		}
		System.out.println("Address ?");
		
		

	}

}
