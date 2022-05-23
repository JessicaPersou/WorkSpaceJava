package Encapsuletion;

public class Cat extends Animal{
    private String eat;

    public Cat(String breed, String size, String eat) {
        super(breed, size);
        this.eat = eat;
    }

    public void sound(){
        System.out.println("Cat MEOWING ...");
    }

    public String getEat(){
        return eat;
    }
    public void setEat(String eat){
        this.eat = eat;
    }

}
