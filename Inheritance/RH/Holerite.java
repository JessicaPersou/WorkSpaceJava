package RH;

public record Holerite(String nome, String mesAno, double valorSalario) {

    public void imprimir(){
        System.out.printf("Nome: %s\nMes/Ano: %s\nSalario: %.2f\n",
                nome(), mesAno(), valorSalario()  );
    }
}
