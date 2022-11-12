package exercicios;

public class Curso {
    public void escreveNome(){
        int i = 0;
        while (i < 5){
            System.out.println("Elas Tech");
            i++;
        }
    }

    public static void main(String[] args) {
        Curso n = new Curso();
        n.escreveNome();
    }
}


