import java.util.Scanner;

public class Ex3 {
    /*
    3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e
      mostre-o expresso em horas, minutos e segundos.
    */
    public static void main(String[] args) {
        int minut = 60, hour;
        System.out.println("Insert the duration: ");
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();
        hour = second/3600;
        minut = second/minut;

        System.out.println("Hours of duration: " + hour);
        System.out.println("Minut of duration: " + minut);
        System.out.println("Second of duration: " + second);

    }
}
