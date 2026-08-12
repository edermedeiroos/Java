package lista_01.exercicio_03;

public class Lampada implements Ligavel {
    private boolean ligado;
    private String comodo;

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

    public String getComodo() {
        return comodo;
    }

    public void setComodo(String comodo) {
        this.comodo = comodo;
    }
}
