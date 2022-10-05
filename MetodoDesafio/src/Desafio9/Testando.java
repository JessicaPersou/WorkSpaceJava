package Desafio9;

import javax.lang.model.element.AnnotationMirror;

public class Testando {

    public static void main(String[] args) {

        Animal mel = new Cachorro();
        ((Cachorro) mel).setNome("Mel");
        mel.setEspecie("Mamifero");
        mel.emitirSom();
        mel.alimentar();
        System.out.println(((Cachorro) mel).getNome());

    }
}
