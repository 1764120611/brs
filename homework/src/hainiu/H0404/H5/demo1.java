package hainiu.H0404.H5;

import java.util.Enumeration;
import java.util.Properties;

public class demo1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("name","BRS");
        properties.setProperty("age","18");
        properties.setProperty("n","陆依依");
        properties.forEach((k,v)->System.out.println(k+"="+v));
        Enumeration<?>propertyNames=properties.propertyNames();
        while (propertyNames.hasMoreElements()){
            String key = (String) propertyNames.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key+"="+value);
        }
    }
}
