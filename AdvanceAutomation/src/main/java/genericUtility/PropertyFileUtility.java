package genericUtility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
	public static String PropertyReader(String KeyValue) throws IOException {
		FileInputStream fis =new FileInputStream(",/src/main/java/genericUtility/PropertyFileUtitlity.java");
		
	    Properties property=new Properties();
		property.load(fis);
		String Value =property.getProperty(KeyValue);
		return Value;
		
	}

}
