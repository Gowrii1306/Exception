package exceptionsHandling;

public class Exception4 { 
	public static void main(String[] args) {
		

	String name = "Gowrii";
	try {
		System.out.println(name.charAt(8));
	}
	catch (ArithmeticException ae) {
		System.out.println("hello");
	}
	catch (StringIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	finally {
		System.out.println("Must Print");
	}
	
	
	}
}
