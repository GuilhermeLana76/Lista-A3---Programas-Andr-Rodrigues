import java.util.Scanner;
import A3POO.jogo;

public class Questao3 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    A3POO.jogo jogo = new jogo();

        System.out.println("Bem-vindo ao jogo Qual é o filme.");

            //Setando o nome do filme
            System.out.println("Jogador 1 Ensira o nome do filme.");
            String filme = scanner.nextLine();

            //Setando as dicas do filme
            jogo.setlerpistas();

            //Adivinhando o nome do Filme
            jogo.setMostrarPistas(filme);

            //Comparando Filme com a resposta.
            jogo.setComparaFilme(filme);


            System.out.println("Progama encerrado.");
    
    scanner.close();
    }
}
