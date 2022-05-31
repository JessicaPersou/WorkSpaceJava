public class Bird extends Animal {

    private String home;
    public Bird(String name, String type, String home) {
        super(name, type);
        this.home = home;
    }

    @Override // Sobreescrita de método
    public void sound () {
        System.out.println("Arr Arr Arr");
    }

    public String getHome() {
        return home;
    }
    public void setHome(String home) {
        this.home = home;
    }
}
