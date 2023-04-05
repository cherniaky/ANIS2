package cvik7;

@interface Test {
}

@interface Verzia {
    int number();

    String author();
}

@Verzia(number = 1, author = "John Doe")
public class Program1 {
    @Test
    @Verzia(number = 2, author = "John Doe")
    public void vypocitaj() {
    }
}
