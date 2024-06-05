# Lista-A3---Programas-Andr-Rodrigues

--Instruções da Atividade-- 

1 - Crie um algoritmo que simule o funcionamento de um caixa de supermercado. O caixa fica aberto até o fim do expediente e pode processar a compra de vários clientes. Cada cliente pode comprar vários itens. Ao ler cada item deve ser exibida uma mensagem para o operador do caixa perguntando se há mais itens a serem processados. Ao final, exiba quanto a compra custou ao cliente. E então solicite do operador do caixa a informação se deseja fechar o caixa. Encerre o algoritmo quando o usuário informar que deseja fechar o caixa.


2 - Crie um algoritmo que leia um número inteiro e mostre seu sucessor.

3- Escreva um programa que implemente o jogo “Qual é o filme?”. Nesse o jogo, o jogador 1  
deve digitar o nome de um filme e em seguida 5 pistas descritivas sobre o filme. Depois, o  
jogador 2 tem 5 chances para tentar adivinhar o nome do filme. Inicialmente somente a  
primeira pista é mostrada para o jogador 2, mas sempre que ele errar o nome do filme, uma nova pista é exibida na tela e o jogador pode tentar adivinhar o nome filme  
novamente.pontuação do jogador 2 depende do número de pistas que ele utilizou para descobrir o  
nome do filme:  

1 pista: +100  
2 pistas: +60  
3 pistas: +40  
4 pistas: +20  
5 pistas: +10  

Na implementação do jogo, você deve utilizar um array de Strings para armazenar as  
pistas sobre o filme. 
O seu programa deve implementar pelo menos as seguintes funções:  

lerPistas: a função recebe como parâmetro um array de strings. A função  
deve pedir para o jogador digitar as 5 pistas e armazenar as pistas dentro do array;  

mostrarPistas: a função recebe como parâmetro um array de strings e um  
inteiro indicando o número de pistas que devem ser exibidas. A função deve exibir  
na tela o número especificado de pistas;  

comparaFilme: a função recebe como parâmetro duas strings e deve retornar  
1 caso o nome dos filmes seja igual e 0 caso sejam diferentes;  

Além das funções sugeridas, você é livre para criar mais função para facilitar a  
implementação do programa.  

Implemente também a função principal do programa para permitir que 2 jogadores  
possam jogar o jogo “Qual é o filme?”. Ao final do jogo, o programa deve exibir a  
pontuação dos jogadores.  

4-  Crie uma classe para representar uma conta-corrente, com métodos para depositar uma quantia, sacar
uma quantia e obter o saldo. Para cada saque será debitada também uma taxa de operação
equivalente à 0,5% do valor sacado.
Crie, em seguida, uma subclasse desta classe anterior para representar uma conta-corrente de um
cliente especial. Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. Faça
testes com as duas classes e verifique seus resultados.
