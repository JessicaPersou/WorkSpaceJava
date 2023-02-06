package RH;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora){
        setNome(nome);
        setValorHora(valorHora);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        Objects.nonNull(nome);
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        if(valorHora < 0 ){
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas){
        double calc = getValorHora() * horasTrabalhadas;
        return calc;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesAno){
        double valorSalario = calcularSalario(horasTrabalhadas);
        return new Holerite(getNome(), mesAno,valorSalario);
    }

    @Override
    public String toString() {
        return String.format("Dados do Funcionario\nNome: %s, Valor hora: %d", nome, valorHora);
    }
}
