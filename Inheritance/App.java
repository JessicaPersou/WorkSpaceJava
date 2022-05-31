public class App {
    public static void main(String[] args) {
        Bird macaw = new Bird("Macaw", "Bird", "Jungle");
        macaw.sound();

        System.out.println( "My name is " + macaw.getName() + ", and i live in " + macaw.getHome());
    }
}
