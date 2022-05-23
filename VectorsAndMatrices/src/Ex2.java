import java.util.Scanner;

public class Ex2 {
    /*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
     *  A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vect[] = new int[10],x,m=0, note=0, cont=0, average=0;

        for(x=0;x<10;x++) {
            System.out.println("Insert a number between 1 and 6: ");
            vect[x] = sc.nextInt();
            note+=vect[x];

            if(vect[x]>m) {
                m=vect[x];
            }

            if(vect[x]==m) {
                cont++;
            }

        }	average= note/10;
        System.out.println("the bigger score is: " + cont + " vezes, an the average is: " + average);
    }

}
