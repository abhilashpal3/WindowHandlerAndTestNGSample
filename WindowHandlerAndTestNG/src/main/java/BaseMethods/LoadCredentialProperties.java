package BaseMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadCredentialProperties {

	Properties prop = new Properties();

	String FilePath = "C:\\RequiredFilesUtility\\Credentials\\Credential.properties";

	public String getUsername() throws IOException {

		FileInputStream fis = new FileInputStream(new File(FilePath));

		prop.load(fis);

		String username = prop.getProperty("Username");
		
		return username;

	}
}
