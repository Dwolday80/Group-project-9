package b22Group9.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    //1. Create properties object

    private static Properties properties = new Properties();

    static {


        try {
            //2 - load the file into FileInputStream
            FileInputStream file = new FileInputStream("configuration.properties");

            //3. -  load properties object with the file (configuration.properties)
            properties.load(file);

            file.close();

        } catch (IOException e) {

            System.out.println("File not found in Configuration properties.");
        }
    }

    //USE THE ABOVE CREATED LOGIC TO CREATE A RE_USABLE STATIC METHOD
    public static String getProperty(String keyWord){
        return properties.getProperty(keyWord);
    }

}
