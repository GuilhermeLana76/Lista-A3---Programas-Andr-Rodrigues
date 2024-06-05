import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Setando preços dos produtos 
    Double acucar = 19.29;
    Double feijao = 5.39;
    Double arroz = 13.99;
    Double carne = 32.99;
    Double oleo = 7.99;
    Double leite = 5.99;


    //Iniciando Caixa
    System.out.println("Digite ( 1 ) para iniciar");
    int iniciar = scanner.nextInt();

    while( iniciar == 1 ){

            //Setando Códigos dos produtos
            System.out.println("Bem-Vindo ao Caixa. Por favor ensira o Código dos produtos do cliente");
            System.out.println("1 - Açucar");
            System.out.println("2 - Feijão");
            System.out.println("3 - Arroz");
            System.out.println("4 - Carne");
            System.out.println("5 - Óleo");
            System.out.println("6 - Leite");
            System.out.println("0 - para parar de adicinar");
            int item = scanner.nextInt();

            Double preco = 0.0;

        if (item == 0) {
        System.out.println("Adição ao carrinho encerrada.");
        }
    
        while (item != 0) {
            switch (item) {

                case 1:
                    preco += acucar;
                    System.out.println("Açucar adicionado");
                    item = scanner.nextInt();
                break;

                case 2: 
                    preco += feijao;
                    System.out.println("Feijao adicionado");
                    item = scanner.nextInt();   
                break;

                case 3: 
                    preco += arroz;
                    System.out.println("Arroz adicionado");
                    item = scanner.nextInt();
                break;

                case 4: 
                    preco += carne;
                    System.out.println("Carne adicionado");   
                    item = scanner.nextInt();   
                break;

                case 5:
                    preco += oleo;
                    System.out.println("Oleo adicionado");
                    item = scanner.nextInt();
                break;

                case 6:
                    preco += leite;
                    System.out.println("Leite adicionado");
                    item = scanner.nextInt();
                break;

                default:
                    System.out.println("Codigo invalido!");
                    item = scanner.nextInt();
                break;
            } 
        }

        System.out.println("O valor a ser pago é " + preco + "R$");
        System.out.println("Deseja encerrar o caixa?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");
        int encerrar = scanner.nextInt();

        if (encerrar == 1) {
            iniciar += 1;
        }

    }

    System.out.println("Obrigado e volte sempre!");
    
    scanner.close();
    }
}