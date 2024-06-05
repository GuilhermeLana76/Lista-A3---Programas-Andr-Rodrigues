package A3POO;

public class ContaCorrenteEspecial extends banco {
    private final double taxaEspecial = 0.001; // Taxa de operação especial (0,1%)

    public ContaCorrenteEspecial(String nome, int conta, Double saldo) {
        super(nome, conta, saldo);
    }

    @Override
    public void setSacar(Double saque) {
        double valorComTaxa = saque * (1 + taxaEspecial);
        if (valorComTaxa <= getSaldo()) {
            setSaldo(getSaldo() - valorComTaxa);
            System.out.println("Saque de " + saque + "$ feito com taxa especial.");
            System.out.println("Seu saldo agora é de: " + getSaldo() + "R$");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
