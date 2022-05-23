import java.util.Scanner;

public class Ex2 {
    /*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int odd = 0, even = 0;
        for (int i = 0; i < 10 ; i++){
            System.out.println("Insert a number: ");
            int j = sc.nextInt();

            if (j % 2 != 0){
                 odd +=1;
            }else{
                 even +=1;
            }
        }
        System.out.println("This number is even: " + even);
        System.out.println("This number is odd: " + odd);
    }
}
