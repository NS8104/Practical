package properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {

		doesfileExist("Data\\np.properties");
		readfile("Data\\np.properties");


	}

	public static void doesfileExist(String Path) {

		String path = "Data\\np.properties";
		Properties prop = new Properties();
		File file = new File(Path);
	    if (Path ==path) {
	    	System.out.println(" Correct path:The path entered contains the file");
	    	}
	    else {
	    	System.out.println("Incorrect Path:Please re-check");
	    	}

	}
	public static void readfile(String Path) throws IOException {
		
		Properties prop = new Properties();

		File file = new File(Path);

		FileReader FR = new FileReader(file);
		BufferedReader BR = new BufferedReader(FR);// to read by Characters
		
		String line;
		while((line=BR.readLine())!=null) {
			 String[] values = line.split(",");
//			//System.out.println(value[0]);
//			System.out.println(values[0]);
//			System.out.println(values[1]);
			//System.out.println(values[2]);
			for (String item:values) {
				System.out.println(item);
			}
		}

	}

}
