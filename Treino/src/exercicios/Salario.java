package exercicios;

public class Salario {

    public int salario;

    public int informaValorImposto(int salario) {
        if (salario > 5000) {
            return 15;
        } else {
            return 5;
        }
    }

    public static void main(String[] args) {
        Salario s = new Salario();
        int exibe = s.informaValorImposto(7000);
        System.out.println(exibe);
    }
    }
