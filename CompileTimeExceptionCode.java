package exceptionsHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CompileTimeExceptionCode  {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File f = new File("D:\\hi.txt");
			FileReader fr = new FileReader(f);
			int temp =0;
			while((temp =fr.read())!=-1) {
				System.out.print((char)(temp));
			}
		}
		catch(Exception r) {
			System.out.println(r);
		}

	}

}
