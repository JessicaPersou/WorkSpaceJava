package Exercice;

import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int read[] = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i ++){
             read[i] = sc.nextInt();
                sum += read[i];
        } System.out.println("Sum of Number: " + sum);

    }
}
