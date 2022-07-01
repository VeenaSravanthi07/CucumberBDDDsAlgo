package scrapers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class propertieDemo {

	public static void main(String[] args) throws IOException {
		// create an object for properties
		
		Properties property = new Properties();
		
		//copy paste the location of properties file
		
		FileInputStream fis = new FileInputStream("C:\\Users\\shrav\\eclipse-workspace\\seleniumDemoProject\\demo.properties");
      
		//Load our properties file with object created 
		
		property.load(fis);
	//Getting the properties from the property file using getProperty method
		System.out.println(property.getProperty("browser"));
		System.out.println(property.getProperty("url"));
		
		//updating the properties file
		property.setProperty("browser","chrome");
		System.out.println(property.getProperty("browser"));
		
		property.setProperty("url","google.com");
		System.out.println(property.getProperty("url"));
		
		//to modify value present in the properties file itself
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\shrav\\eclipse-workspace\\seleniumDemoProject\\demo.properties");
		property.store(fos, null);
		
		
		
		
		
		
		
		
		
	}

}
