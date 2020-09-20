import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.MessageFormat;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}