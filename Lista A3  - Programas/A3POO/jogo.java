package A3POO;
import java.util.Scanner;

public class jogo {
Scanner scanner = new Scanner(System.in);

    private String lerpistas;
    private String mostrarPistas;
    private String comparaFilme; 
    private String[] dicas;
    private String resposta;

//Função Ler pistas
public String getLerpistas(){
        return lerpistas;
}

public void setlerpistas(){

    System.out.println("Agora ensira as 5 dicas sobre o filme.");
        String[] dicas = new String[5];

    for(int i = 0; i < dicas.length; i++){
        System.out.println("Dica " + (i+1) + ": ");
        dicas[i] = scanner.nextLine();
        this.dicas = dicas;
    }
}

//Função Mostras pistas
public String getMostrarPistas(){
    return mostrarPistas;
}

public void setMostrarPistas(String filme){
    System.out.println("Agora é sua vez jogador 2! Tente acertar o filme.");
    int ponto = 0;
    int pontuacao = 0;

    for(int i = 0; i < 5; i++){
        System.out.println("A dica número " + (i+1) +  " é:");
        System.out.println(dicas[i]);
        String resposta = scanner.nextLine();
        this.resposta = resposta;
        ponto++;

        if(filme.equals(resposta)){
            System.out.println("Parabens você acertou o nome do filme!");

            switch (ponto) {
                case 1:
                    pontuacao = 100;
                break;
        
                case 2:
                    pontuacao = 60;
                break;

                case 3:
                    pontuacao = 40;
                break;

                case 4:
                    pontuacao = 20;
                break;

                case 5:
                    pontuacao = 10;
                break;
    
                default:
                    pontuacao = 0;
                break;
            }

        System.out.println("Sua pontuação foi de: " + pontuacao);
        i = 100;
        }

    }
}

//Função Comparar Filmes
public String getComparaFilme(){
    return comparaFilme;
}

public void setComparaFilme(String filme){

    if(filme.equals(resposta)){
        System.out.println("Resultado da comparação é: 1");
    }
    else{
        System.out.println("Resultado da comparação é: 0");
    }

}




}