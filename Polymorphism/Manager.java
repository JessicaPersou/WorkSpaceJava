public class Manager extends Person{

    private boolean rich = false;

    public Manager(String name, String age, String occupation, boolean rich) {
        super(name, age, occupation);
        this.rich = rich;
    }

    public void bigSalary(){
        if(rich){
            System.out.println("Meu salario é muito Alto");
        }
    }
}
