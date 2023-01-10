package exceptionsHandling;

public class Exception2 {

	public static void main(String[] args) {
		String name = null;
		try {
			System.out.println(name.toUpperCase());
		}
		catch (NullPointerException ae){
			System.err.println("Dont give null ");
			ae.printStackTrace();
		}
		finally {
			System.out.println("hi");
		}

	}

}
