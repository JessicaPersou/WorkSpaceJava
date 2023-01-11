package Desafio9;

import java.util.Date;

public abstract class Animal {

    private String especie;

    public abstract void alimentar();

    public void emitirSom(){
        System.out.println("O animal vai emitir um som!");
    }

    public Animal() {
    }

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}
