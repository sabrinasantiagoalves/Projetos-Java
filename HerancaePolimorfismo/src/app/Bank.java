package app;

import nucleo.Conta;
import nucleo.ContaEspecial;

public class Bank {
    public static void main(String[] args) {
        Conta c1 = new Conta("Sabrina", "472.143.488-02", 12345, 300.0);
        Conta c2 = new ContaEspecial("Sabrina","472.143.488-02",12345,600,300);
        System.out.println(c1);
        System.out.println(c2);

        //chamando o debitar da classe Conta
        c1.debitar(80);
        //chamando o debitar da classe ContaEspecial
        c2.debitar(650);

        System.out.println(c1);
        System.out.println(c2);

    }
}
