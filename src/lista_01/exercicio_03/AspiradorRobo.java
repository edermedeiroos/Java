package lista_01.exercicio_03;

public class AspiradorRobo implements Ligavel, Recarregavel {
    private boolean ligado;
    private int nivelBateria;

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

    @Override
    public void recarregar(int minutos) {
        this.nivelBateria = Math.min(100, this.nivelBateria + minutos);
    }

    @Override
    public int getNivelBateria() {
        return nivelBateria;
    }

    public void setNivelBateria(int nivelBateria) {
        this.nivelBateria = nivelBateria;
    }
}
