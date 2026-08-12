package lista_01;

public class Administrador extends Funcionario {
    public Administrador(String nome, int matricula, double salario) {
        super(nome, matricula, salario);
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalario() * 12;
    }
}
