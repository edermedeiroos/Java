package lista_01.exercicio_03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tipo;
        int estado;
        int operacao;
        int nivelBateria;
        int tempoRecarga;
        String comodo;
        String marca;
        Lampada lampada = new Lampada();
        Televisao televisao = new Televisao();
        AspiradorRobo aspiradorRobo = new AspiradorRobo();

        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.print("Tipo (1 - Lampada | 2 - TV | 3 - Aspirador): ");
            tipo = scanner.nextInt();
            scanner.nextLine();

            switch (tipo) {
                case 0:
                    System.out.println("Encerrando ...");
                    executando = false;
                    break;

                case 1:
                    System.out.print("Comodo: ");
                    comodo = scanner.nextLine();
                    lampada.setComodo(comodo);

                    System.out.print("Estado inicial (1 - Ligado | 2 - Desligado): ");
                    estado = scanner.nextInt();
                    switch (estado) {
                        case 1:
                            lampada.ligar();
                            break;
                        case 2:
                            lampada.desligar();
                            break;
                    }

                    System.out.print("Operação (1 - Ligar | 2 - Desligar | 3 - Estado): ");
                    operacao = scanner.nextInt();
                    scanner.nextLine();

                    switch (operacao) {
                        case 1:
                            lampada.ligar();
                            System.out.println("Lampada da " + comodo + ": " + (lampada.estaLigado() ? "ligada" : "desligada"));
                            break;
                        case 2:
                            lampada.desligar();
                            System.out.println("Lampada da " + comodo + ": " + (lampada.estaLigado() ? "ligada" : "desligada"));
                            break;
                        case 3:
                            System.out.println("Lampada da " + comodo + ": " + (lampada.estaLigado() ? "ligada" : "desligada"));
                            break;
                    }
                    break;

                case 2:
                    System.out.print("Marca: ");
                    marca = scanner.nextLine();
                    televisao.setMarca(marca);

                    System.out.print("Estado inicial (1-Ligado 0-Desligado): ");
                    estado = scanner.nextInt();
                    switch (estado) {
                        case 1:
                            televisao.ligar();
                            break;
                        case 0:
                            televisao.desligar();
                            break;
                    }

                    System.out.print("Operacao (1-Ligar 2-Desligar 3-Estado): ");
                    operacao = scanner.nextInt();

                    switch (operacao) {
                        case 1:
                            televisao.ligar();
                            System.out.println("Televisao " + marca + ": " + (televisao.estaLigado() ? "ligada" : "desligada"));
                            break;
                        case 2:
                            televisao.desligar();
                            System.out.println("Televisao " + marca + ": " + (televisao.estaLigado() ? "ligada" : "desligada"));
                            break;
                        case 3:
                            System.out.println("Televisao " + marca + ": " + (televisao.estaLigado() ? "ligada" : "desligada"));
                            break;
                    }
                    break;

                case 3:
                    System.out.print("Nivel inicial de bateria: ");
                    nivelBateria = scanner.nextInt();
                    aspiradorRobo.setNivelBateria(nivelBateria);

                    System.out.print("Estado inicial (1-Ligado 0-Desligado): ");
                    estado = scanner.nextInt();
                    switch (estado) {
                        case 1:
                            aspiradorRobo.ligar();
                            break;
                        case 0:
                            aspiradorRobo.desligar();
                            break;
                    }

                    System.out.print("Operacao (1-Ligar 2-Desligar 3-Estado 4-Recarregar 5-Bateria): ");
                    operacao = scanner.nextInt();

                    switch (operacao) {
                        case 1:
                            aspiradorRobo.ligar();
                            System.out.println("Aspirador: " + (aspiradorRobo.estaLigado() ? "ligado" : "desligado"));
                            break;
                        case 2:
                            aspiradorRobo.desligar();
                            System.out.println("Aspirador: " + (aspiradorRobo.estaLigado() ? "ligado" : "desligado"));
                            break;
                        case 3:
                            System.out.println("Aspirador: " + (aspiradorRobo.estaLigado() ? "ligado" : "desligado"));
                            break;
                        case 4:
                            System.out.print("Tempo de recarga em minutos: ");
                            tempoRecarga = scanner.nextInt();
                            aspiradorRobo.recarregar(tempoRecarga);
                            System.out.println("Bateria do aspirador: " + aspiradorRobo.getNivelBateria() + "%");
                            break;
                        case 5:
                            System.out.println("Bateria do aspirador: " + aspiradorRobo.getNivelBateria() + "%");
                            break;
                    }
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
