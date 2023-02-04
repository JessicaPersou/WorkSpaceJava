package Bank;

public class Person {
    private String name;
    private String document;

    public Person(String name, String document){
        this.name = name;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String toString(){
        return String.format("%s\nCPF: %s", name,document);
    }
}
