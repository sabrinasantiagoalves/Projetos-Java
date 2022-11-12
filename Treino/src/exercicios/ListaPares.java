package exercicios;

import java.util.List;

public class ListaPares {

    public void listaPares() {
        int num = 0;

        while (num <= 100) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        ListaPares exibir = new ListaPares();
        exibir.listaPares();
    }
}
