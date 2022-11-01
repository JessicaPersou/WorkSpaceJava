package Exercice;

import java.util.Scanner;

public class Ex1 {
    /*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
     *  Encontre após a maior pontuação e a apresente.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vect[] = new int[5], bigger = 0;

        for ( int i = 0; i < 5; i++){
            System.out.println("Insert the score: ");
            vect[i] = sc.nextInt();

            if(vect[i] > bigger) {
                bigger=vect[i];

            }
        }System.out.println("The bigger point is: " + bigger);
    }
}


