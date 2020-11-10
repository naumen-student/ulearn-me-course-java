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


public class Tests {

    private static boolean isMainMethod(Method method) {
        int modifiers = method.getModifiers();
        return method.getName().equals("main") && Modifier.isStatic(modifiers) && Modifier.isPublic(modifiers) && method.getReturnType() == void.class;
    }

    @Test
    public void testEven() {
        try {
            Class<?> clazz = Class.forName("HelloWorld");
            Method main = Arrays.stream(clazz.getDeclaredMethods()).filter(Tests::isMainMethod).findFirst().orElseThrow(() -> new AssertionError("Не найден main метод"));
            try {
                PrintStream sout = System.out;
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                Field field = System.class.getField("out");
                field.setAccessible(true);
                Field modifiersField = Field.class.getDeclaredField("modifiers");
                modifiersField.setAccessible(true);
                modifiersField.setInt(field, field.getModifiers() & ~Modifier.FINAL);
                try {
                    field.set(System.class, new PrintStream(baos));
                    main.invoke(clazz, new Object[]{ new String[0] });
                } finally {
                    field.set(System.class, sout);
                }
                String value = baos.toString().trim();
                Assert.assertEquals("Hello, World!", value);
            } catch (Exception e) {
                throw new AssertionError(e);
            }
        } catch (ClassNotFoundException e) {
            throw new AssertionError("Класс HelloWorld не найден");
        }
    }

}