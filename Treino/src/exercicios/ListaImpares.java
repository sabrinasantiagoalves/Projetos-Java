package exercicios;

public class ListaImpares {

    public void listaImpar(){
        int num = 0;
        while(num <=100){
            if(num%2 != 0){
                System.out.println(num);
            }
        num++;
        }
    }

    public static void main(String[] args) {
        ListaImpares n = new ListaImpares();
        n.listaImpar();
    }
}

//for(variavel controle; condição;incremento){}