import java.util.Scanner;

public class Ex6 {
    /*Escrever um programa que receba vários números inteiros no teclado. E no final imprimir a média dos números múltiplos de 3.
     *  Para sair digitar 0(zero).(DO...WHILE)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int avarage,number, multi = 0, sum = 3;
        do{
            System.out.println("Insert number: ");
            number = sc.nextInt();
            if(number%3 == 0 && number != 0){
                sum += number;
                multi ++;
            }
        }while(number != 0);
        avarage = sum/multi;
        System.out.println("The average of number is: " + avarage);
    }
}
