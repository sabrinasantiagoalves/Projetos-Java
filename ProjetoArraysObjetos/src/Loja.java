import java.util.ArrayList;

public class Loja {
    public static void main(String[] args) {

        ArrayList<Produto> lista;

        lista = new ArrayList<Produto>();

        lista.add(new Produto(1, "Computador",2500.0));
        lista.add(new Produto(2,"Mouse",30.0));
        lista.add(new Produto(3,"Fone de ouvido",150.0));

        lista.remove(1);

//        for (int i=0; i< lista.size();i++){
//            System.out.println(lista.get(i));
//        }

        //percorrendo a lista usando for each

        for(Produto p : lista){
            System.out.println(p);
        }

    }
}
