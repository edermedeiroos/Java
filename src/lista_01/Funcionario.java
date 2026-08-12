package lista_01;

public abstract class Funcionario {
    private String nome;
    private int matricula;
    private double salario;

    public Funcionario(String nome, int matricula, double salario) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
    }

    public abstract double calcularSalarioAnual();

    public void apresentar() {
        System.out.println("Olá! Me chamo " + getNome() +
                ", sou um " + getClass().getSimpleName() +
                " de matrícula " + getMatricula() +
                ", e recebo R$" + calcularSalarioAnual() +
                " de remuneração anual.");
    }

    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
