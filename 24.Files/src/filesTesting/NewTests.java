package filesTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class NewTests {
	public static void main(String[] args) throws IOException {
		File reading = new File("read.txt");
		if (!reading.exists()) {
			try {
				reading.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		String text = "testvam da addna text v file";
		try (PrintWriter add = new PrintWriter(reading);) {

			add.write(text);
			add.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			InputStream input = new FileInputStream(reading);
			int b = input.read();

			while (b != -1) {
				System.out.print((char) b);
				b = input.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
