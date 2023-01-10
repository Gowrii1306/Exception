package exceptionsHandling;

public class Exception1 {

	public static void main(String[] args) {

		int a = 10;
		int b = 2;
		int c = 0;
		System.out.println(a/b);
		try {
		System.out.println(a/c);
		}
		catch (Exception ae) {
			System.out.println(ae);
		}
		
		finally {
			System.out.println("hello");
		}
		System.out.println(a+b);
		System.out.println(a-b);
	}

}
