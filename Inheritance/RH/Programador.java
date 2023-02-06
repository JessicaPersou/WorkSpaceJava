package RH;

public class Programador extends Funcionario{

    private double valorBonus;

    public Programador(String nome, double valorHora){
        super(nome,valorHora);
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        if (valorBonus < 0 ){
            throw new IllegalArgumentException("Valor do Bônus, não pode ser negativo.");
        }
        this.valorBonus = valorBonus;
    }

    @Override
    protected double calcularSalario(int horasTrabalhadas) {
        double calc = super.calcularSalario(horasTrabalhadas);
        return calc + valorBonus;
    }

    public String toString(){
        return String.format("Valor Bonus: %d", valorBonus);
    }
}
