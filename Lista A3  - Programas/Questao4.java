import A3POO.banco;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CRIANDO A CONTA
        System.out.println("Bem-vindo à Conta Bancária em Java - POO");

        System.out.println("Favor inserir seu nome: ");
        String nome = scanner.nextLine();
        banco conta = new banco(nome, 0, 0.0);

        System.out.println("Favor inserir o número da conta: ");
        int numeroConta = scanner.nextInt();
        conta.setConta(numeroConta);

        System.out.println("Favor inserir seu saldo: ");
        Double saldo = scanner.nextDouble();
        conta.setSaldo(saldo);

        System.out.println("Conta criada com sucesso!");

        // AÇÕES DA CONTA
        int escolha;
        do {
            System.out.println("Qual ação deseja utilizar?");
            System.out.println("1 - Depositar valor");
            System.out.println("2 - Sacar valor");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Encerrar programa");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Insira o valor que deseja depositar: ");
                    Double deposito = scanner.nextDouble();
                    conta.setDepositar(deposito);
                    break;

                case 2:
                    System.out.println("Deseja usar uma conta especial para o saque?");
                    System.out.println("1 - Sim // 2 - Não");
                    int esc = scanner.nextInt();

                    if (esc == 1) {
                        A3POO.ContaCorrenteEspecial contaEspecial = new A3POO.ContaCorrenteEspecial(nome, numeroConta, saldo);
                        System.out.println("Insira o valor que deseja sacar: ");
                        Double sacar = scanner.nextDouble();
                        contaEspecial.setSacar(sacar);
                    } else if (esc == 2) {
                        System.out.println("Insira o valor que deseja sacar: ");
                        Double saque = scanner.nextDouble();
                        conta.setSacar(saque);
                    }
                    break;

                case 3:
                    conta.setConsulta();
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}