package Encapsuletion;

public class Animal {
    private String breed;
    private String size;

    public Animal(String breed, String size){
        this.breed = breed;
        this.size = size;
    }

    public void eat(){
       System.out.println("I'm a " + getBreed());
    }

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    public String getSize(){
        return size;
    }
    public void setSize(String size){
        this.size = size;
    }
}
