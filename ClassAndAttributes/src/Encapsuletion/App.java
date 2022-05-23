package Encapsuletion;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat("Persa", "Little", "Meat");
        cat.sound();
        System.out.println(cat.getBreed());
    }
}
