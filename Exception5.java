package exceptionsHandling;

public class Exception5 { 
	public static void main(String[] args) {
		

	String name[] = {"Gowrii","Pragadeesh"};
	try {
		System.out.println(name[3]);
	}
	catch (ArithmeticException ae) {
		System.out.println("hello");
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Hello");
	}
	finally {
		System.out.println("Must Print");
	}
	
	
	}
}
