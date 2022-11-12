package model;

public class Chefe extends Funcionario {
    private double salarioBase;
    private double adicionalFuncao;
    private double beneficioTerno;

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getAdicionalFuncao() {
        return adicionalFuncao;
    }

    public void setAdicionalFuncao(double adicionalFuncao) {
        this.adicionalFuncao = adicionalFuncao;
    }

    public double getBeneficioTerno() {
        return beneficioTerno;
    }

    public void setBeneficioTerno(double beneficioTerno) {
        this.beneficioTerno = beneficioTerno;
    }

    public Chefe(int numRegistro, String nome) {
        super(numRegistro, nome);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + salarioBase*adicionalFuncao/100 + beneficioTerno;
    }
}
