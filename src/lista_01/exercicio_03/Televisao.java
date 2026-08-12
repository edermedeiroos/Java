package lista_01.exercicio_03;

public class Televisao implements Ligavel {
    private boolean ligado;
    private String marca;

    @Override
    public void ligar() {
        System.out.println("Ligando dispositivo " + getClass().getSimpleName());
        this.ligado = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando dispositivo " + getClass().getSimpleName());
        this.ligado = false;
    }

    @Override
    public boolean estaLigado() {
        return ligado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
