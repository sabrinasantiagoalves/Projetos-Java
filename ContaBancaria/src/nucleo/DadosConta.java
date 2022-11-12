package nucleo;

public class DadosConta {
    private int numeroConta;
    private int digitoVerif;
    private String nomeTitular;
    private String cpfTitular;
    private double saldo;

    //metodos especificos que dizem respeito à conta bancaria

    public void despositar(double valor){
        this.saldo += valor;
    }

    public String exibirDados () {
        return "Conta" + numeroConta + "-" + digitoVerif + ": " + nomeTitular + "( " + cpfTitular +")" + String.format("%.2f",saldo);
    }

    public boolean sacar(double valor){
        if(saldo >= valor){
            saldo -= valor; // debita o saque do saldo da conta
            return true;
        }
        return false;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public int getDigitoVerif() {
        return digitoVerif;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getCpfTitular() {
        return cpfTitular;
    }

    public DadosConta(int numeroConta, int digitoVerif, String nomeTitular, String cpfTitular, double saldo) {
        this.numeroConta = numeroConta;
        this.digitoVerif = digitoVerif;
        this.nomeTitular = nomeTitular;
        this.cpfTitular = cpfTitular;
        this.saldo = saldo;
    }
}
