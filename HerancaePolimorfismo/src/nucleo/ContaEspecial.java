package nucleo;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial(String nomeTitular, String cpfTitular, int numero, double saldo, double limite) {
        super(nomeTitular, cpfTitular, numero, saldo);
        this.limite = limite;
    }

    @Override
    public String toString(){
        //aqui ele está herdando o metodo toString da classe pai: Conta
        return super.toString() + " Limite R$" + this.limite;
    }

    @Override
    public boolean debitar(double valor){
        if(super.saldo + this.limite >= valor){
            super.saldo -= valor;
            return true;
        }
        return false;
    }

}
