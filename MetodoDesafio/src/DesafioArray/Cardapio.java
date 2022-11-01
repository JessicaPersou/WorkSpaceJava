package DesafioArray;

import java.util.ArrayList;

public class Cardapio {

    ArrayList<ItemCardapio> itens = new ArrayList<>();

    void adicionarItem(ItemCardapio item) {
      itens.add(item);
    }

    void removerItem(int indice) {
        itens.remove(indice);
    }

//    void imprimirItensCardapio(double precoMinimo, double precoMaximo) {
//        // TODO implementar código para imprimir na console os itens
//        //  do cardápio que estiverem entre o preço mínimo e máximo
//    }

}