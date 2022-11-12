import java.sql.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Loja {

    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<Produto>();

        lista.add(new Produto(1,"Computador", 2500.0));
        lista.add(new Produto(2,"Monitor", 520));
        lista.add(new Produto(3,"Mouse", 25));
        lista.add(new Produto(4,"Fone de ouvido", 80));
        lista.add(new Produto(5,"Impressora", 750));

        //usando stream e estrutura lambda juntas
        lista.stream().forEach((p) -> {System.out.println(p);});

        // EXIBINDO EM ORDEM ALFABETICA
        System.out.println("\n Produtos em ordem alfabética...");
        lista.stream().sorted(Comparator.comparing(p->p.getNome()))
                .forEach(p -> System.out.println(p));

        // EXIBINDO O MAIS CARO
        System.out.println("\n Produtos MAIS CARO...");
        Produto produtoMaisCaro;
        produtoMaisCaro = lista.stream().max(Comparator.comparing(p->p.getPreco()))
                .orElse(null);

        if (produtoMaisCaro != null){
            System.out.println("O produto mais caro é: "+produtoMaisCaro);
        }

        // EXIBINDO O MAIS BARATO
        System.out.println("\n Produtos MAIS BARATO...");
        Produto produtoMaisBarato;
        produtoMaisBarato = lista.stream().min(Comparator.comparing(p->p.getPreco()))
                .orElse(null);

        if (produtoMaisBarato != null){
            System.out.println("O produto mais barato é: "+produtoMaisBarato);
        }

    }

}
