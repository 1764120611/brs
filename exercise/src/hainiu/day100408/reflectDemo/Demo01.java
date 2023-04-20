package hainiu.day100408.reflectDemo;

import javax.naming.Name;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

public class Demo01 {
    public static void main(String[] args) throws IOException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("obj.properties");
        Properties properties = new Properties();
        properties.load(stream);
        //
        String name = properties.getProperty("wName");
        String methodName = properties.getProperty("methodName");
        //
        Class clazz = Class.forName(name);
        Object obj=clazz.getDeclaredConstructor().newInstance();
        Method method = clazz.getMethod(methodName);
        method.invoke(obj);


    }
}
