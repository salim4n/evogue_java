package chapitre5;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MethodInfo {
    String author() default "Auteur inconnu";
    String date() default "Date inconnue";
    double version() default 1.0;
}

class MyClass {
    @MethodInfo(author = "John", date = "2023-10-26", version = 1.2)
    public void method1() {
        System.out.println("Méthode 1");
    }

    @MethodInfo(author = "Alice", date = "2023-10-27", version = 2.0)
    public void method2() {
        System.out.println("Méthode 2");
    }

    public void method3() {
        System.out.println("Méthode 3");
    }
}

public class AnnotationExample {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        Class<?> clazz = myClass.getClass();

        for (Method method : clazz.getDeclaredMethods()) {
            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo annotation = method.getAnnotation(MethodInfo.class);
                System.out.println("Méthode : " + method.getName());
                System.out.println("Auteur : " + annotation.author());
                System.out.println("Date : " + annotation.date());
                System.out.println("Version : " + annotation.version());
                System.out.println();
            }
        }
    }
}

