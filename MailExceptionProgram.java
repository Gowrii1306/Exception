package exceptionsHandling;

import java.util.Scanner;

public class MailExceptionProgram {

	public static void main(String[] args) throws MailException {

		System.out.println("Enter Your MailId:");
		Scanner name = new Scanner(System.in);
		String name1 = name.nextLine();
		
		if(name1.contains("@gmail.com")) {
			System.out.println("valid Gmail   ");
		}
		else {
			throw new MailException("not a Gmail");
		}
	
	}

}
