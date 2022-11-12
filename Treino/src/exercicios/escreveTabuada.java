package exercicios;

public class escreveTabuada {

    public void Tabuada() {
        int resultado;

        for (int x=0; x <10 ; x++){

            for (int j = 1; j <= 10; j++){
                resultado = j * x;
                System.out.println(x + "x" + j + "=" + resultado);
            }

        }

        //int [] arrayT = {1,2,5,6,7};


    }

    public static void main(String[] args) {
        escreveTabuada t = new escreveTabuada();
        t.Tabuada();

    }
}
