public class FolhaPagamento {

    double QtdHorasNormaisTrabalhadas;
    double QtdHorasExtrasTrabalhadas;
    double horasNormais;
    double horasExtras;

    ContratoTrabalho contratoTrabalho;


    double calcularSalario(ContratoTrabalho contratoTrabalho){
        double calcExtra = contratoTrabalho.valorHorasExtras * QtdHorasExtrasTrabalhadas ;
        double calcNormais = contratoTrabalho.valorHorasNormais * QtdHorasNormaisTrabalhadas;
        return calcExtra + calcNormais;
    }
}
