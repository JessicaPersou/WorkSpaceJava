import java.util.Scanner;

public class Ex4 {
    /*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região.
     * Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
     * (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema
     * que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
    o número de pessoas calmas;
    o número de mulheres nervosas;
    o número de homens agressivos;
    o número de outros calmos;
   */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your Gender: 1-Female | 2- Male | 3- Others");
        int myPsico = 0,people = 0, gender = sc.nextInt();
        switch(gender) {
            case 1:
                System.out.println("Female");
                break;
            case 2:
                System.out.println("Male");
                break;
            case 3:
                System.out.println("Others");
                break;
        }

        while(people<=5) {

            switch(myPsico) {
                case 1:
                    System.out.println("Calm (o)");
                    break;
                case 2:
                    System.out.println("Angry (o)");
                    break;
                case 3:
                    System.out.println("Aggressive (o)");
                    break;
            }
        }
    }
}
