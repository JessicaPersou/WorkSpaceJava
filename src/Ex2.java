import java.util.Scanner;

public class Ex2 {
    /*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.*/
    public static void main(String[] args) {
        int days, year, mouth=30, rDays=0, rm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your age in days: ");
        days = sc.nextInt();
        year = days/365;
        rm= days%365;
        mouth= rm/mouth;
        rDays = rm%mouth;
        System.out.println("Years old: " + year);
        System.out.println("Mouth: " + mouth);
        System.out.println("Days: " + rDays);
    }

}
