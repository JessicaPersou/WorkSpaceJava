package ArrayOfObjects;

public class Main {
    public static void main(String[] args) {
        Course java = new Course();
        java.teacher = ("Thiago Faria");
        //primeiro instancia o array, colocando a quantidade de objetos que terá
        java.students = new Student[3];
        //instancia o objeto na posiçao que deseja adicionar e segue com dos dados desejados
        java.students[0] = new Student();
        java.students[0].name = ("Jessica");
        java.students[0].age = 30;

        java.students[1] = new Student();
        java.students[1].name = ("Maria");
        java.students[1].age = 21;

        java.students[2] = new Student();
        java.students[2].name = ("Adriano");
        java.students[2].age = 34;

        System.out.println(java.students[0].name);

        //iteraçao no array de objetos
        for (int i = 0; i < java.students.length; i++) {
            System.out.printf("%d - %s (%d anos)%n", i, java.students[i].name, java.students[i].age);
        }
        //caso não precise do indice do aluno, pode ser feito um for each

    }
}
