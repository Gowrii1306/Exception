package exceptionsHandling;

import java.util.Scanner;

public class Login {

	public static void main(String[] args) throws LoginException,Exception {
		System.out.println("Enter the Use Name :");
		Scanner name = new Scanner(System.in);
		String name1 = name.nextLine();
		System.out.println("Enter the Password :");
		Scanner pass = new Scanner(System.in);
		String password  = pass.nextLine();
		if(name1.equalsIgnoreCase("Gowrii")&&password.equals("9095212345")) {
			System.out.println("Access Granted");
		}
		else {
			throw new LoginException("Denied");
		}
		

	}

}
