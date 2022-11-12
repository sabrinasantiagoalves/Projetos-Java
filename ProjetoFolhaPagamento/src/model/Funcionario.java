package model;

public abstract class Funcionario {
    protected int numRegistro;
    protected String nome;

    // as classes abstratas nos permitem criar as "cláusulas contratuais" para que as subclasses
    // se comprometam a implementar

    public abstract double calcularSalario();


    public int getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(int numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(int numRegistro, String nome) {
        this.numRegistro = numRegistro;
        this.nome = nome;
    }
}
