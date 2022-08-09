import java.util.Scanner;

public class Ex1 {
        /* Faça um programa que receba três inteiros e diga qual é o maior:*/
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insert first number: ");
            int n1 = sc.nextInt();
            System.out.println("Insert second number: ");
            int n2 = sc.nextInt();
            System.out.println("Insert third number: ");
            int n3 = sc.nextInt();

            if(n1>n2 && n1>n3){
                System.out.println("First number is bigger that anothers!");
            }else if(n2>n1 && n2>n3){
                System.out.println("Second number is bigger that anothers!");
            }else{
                System.out.println("Third number is bigger that anothers!");
            }

            //test ternary operator
            int value1 = 5;
            int value2 = 10;

            boolean sintax = (value1 == value2) ?  true :  false;

            System.out.println(sintax);

    }

}
