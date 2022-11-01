package DesafioSwitch;

public class Calendario {

    public static void main(String[] args) {
        String[] mes = { "Janeiro","Fevereiro","Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int i = 9;
        int mostra = i - 1;
        i = mostra;
        if (i >= 1 && i <= mes.length) {
            System.out.println(mes[i]);
        }





    }
}