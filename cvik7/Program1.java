package cvik7;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Test {
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
@interface Verzia {
    int number();

    String author();
} 

public class Program1 {
    @Test
    @Verzia(number = 1, author = "John Doe")
    public void calculate() {
        // method implementation goes here
    }
}
