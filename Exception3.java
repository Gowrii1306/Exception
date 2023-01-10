package exceptionsHandling;

public class Exception3 {

	public static void main(String[] args) {
		try {
		String noPlate = args[0];
		int num = Integer.parseInt(noPlate);
		System.out.println(num);
		}
		catch (ArithmeticException ae) {
			System.out.println("a");
		}
		catch (NullPointerException nee) {
			System.out.println("b");
		}
		catch (NumberFormatException e) {
			System.out.println("c");
		}
		finally {
			System.out.println("hai");
		}
		System.out.println("hi");
	}

}
