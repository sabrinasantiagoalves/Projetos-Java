import java.util.HashMap;

public class Loja {
    //usando listas de HASHMAP (INDICADO QUANDO QUEREMOS USAR LISTAS E REALIZAR BUSCAS DENTRO DELA)

    public static void main(String[] args) {
        //<tipo do valor chave, tipo do valor procurado>
        // sempre usar os tipos correspondentes dos nativos
        // Integer - int
        // Float - float
        // Double - double
        // Character - char

        HashMap<Integer, Produto> mapa;
        mapa = new HashMap<Integer, Produto>();

        //inserindo valores na lista
        mapa.put(1, new Produto(1,"Computador",1500.0));
        mapa.put(2, new Produto(2,"Mouse",40.0));

        // para percorrer a lista do tipo HashMap e encontrar um valor x

        int codigoAbuscar = 3;

        Produto p = mapa.get(codigoAbuscar);

        // se o codigo a buscar for diferente de nulo, exibir e se for nulo significa que não existe na lista
        if (p != null) {
            System.out.println("Valor encontrado: " + p);
        } else {
            System.out.println("Valor não encontrado!");
        }


    }
}
