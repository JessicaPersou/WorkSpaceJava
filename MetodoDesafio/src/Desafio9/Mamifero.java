package Desafio9;

public abstract class Mamifero {
    private String tipo;

    private void dormir(){
        System.out.println("Mamifero dorme muito.");
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
