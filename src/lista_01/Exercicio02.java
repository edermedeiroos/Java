package lista_01;

public class Exercicio02 {
    public static void main(String[] args) {

        Administrador admin = new Administrador("Ana Silva", 1001, 8500.00);
        Desenvolvedor dev = new Desenvolvedor("Carlos Santos", 1002, 6000.00, 2500.00);
        Estagiario estagiario = new Estagiario("Eder Medeiros", 1003, 1400.00);

        Funcionario[] equipe = {admin, dev, estagiario};

        for (Funcionario fun : equipe) {
            fun.apresentar();
            System.out.println("---------------------------------------------------");
        }
    }
}
