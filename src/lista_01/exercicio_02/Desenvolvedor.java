package lista_01.exercicio_02;

public class Desenvolvedor extends Funcionario {
    private double bonus;

    public Desenvolvedor(String nome, int matricula, double salario, double bonus) {
        super(nome, matricula, salario);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalario() * 12 + bonus;
    }
}
