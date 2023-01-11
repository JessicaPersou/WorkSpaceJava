package Desafio1;

public class FolhaPagamento {

    public double calcularSalario(int horasNormais, int horasExtras, double valorNormal, double valorExtra){

        double normal = horasNormais * valorNormal;
        double extra = horasExtras * valorExtra;
        return normal + extra;

    }
}
