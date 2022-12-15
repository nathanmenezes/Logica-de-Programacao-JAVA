package entities;

public class Account {
    private String numeroConta;
    private String nomeTitular;
    private double saldo;

    public Account(String numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }

    public Account(String numeroConta, String nomeTitular, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        Deposito(depositoInicial);
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }
    
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double Deposito(double valorOperacao){
        return saldo += valorOperacao;
    }

    public double Saque(double valorOperacao){
        return saldo -= valorOperacao + 5;
    }

    public String toString(){
        return "Conta: " + numeroConta + " , Titular: " + nomeTitular + " , Saldo: R$ " + saldo;
    }
}
