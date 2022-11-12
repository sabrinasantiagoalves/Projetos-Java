package exercicios;

public class Arrays {
    String [] cidades = new String[3];
    public void mostraCidade() {
        cidades[0] = "Belo Horizonte";
        cidades[1] = "Salvador";
        cidades[2] = "São Paulo";

        int i = 0;
        while (i < cidades.length) {
            System.out.println(cidades[i]);
            i++;
        }
    }
    public void contaElemento(){
        int numeros[] = {1,6,9,10,20};

        int j = 0;
        int soma = 0;

        while (j < numeros.length) {
            //soma = soma + numeros[j];
                soma += numeros[j];
            j++;
        }
        System.out.println(soma);
    }
    int y = 0;

    public void encontraMenor() {
        int num [] = {10,20,30,5};
        int menor = num[0];

        for (int x=1; x < num.length; x++) {
            if (num[x] < menor){
                menor = num[x];
            }
        }
        System.out.println(menor);
    }

    public static void main(String[] args) {
        //testando metodo para mostrar cidade
        Arrays a = new Arrays();
        a.mostraCidade();

        //testando metodo de somar valores do array
        Arrays v = new Arrays();
        v.contaElemento();

        //testando metodo de encontrar menor valor do array
        Arrays m = new Arrays();
        m.encontraMenor();
    }

}
