import java.sql.SQLOutput;

public class ClasseQueUsaInterfaceServico {

    public static void main(String[] args) {

        //executando da forma tradicional (SEM LAMBDA):

        InterfaceServico i;
        i = new InterfaceServico() {
            @Override
            public void executa() {
                System.out.println("executando algo...");
            }

        };
        i.executa();

        InterfaceServico i2;
        i2 = new InterfaceServico() {
            @Override
            public void executa() {
                System.out.println("Outra execução...");
            }
        };
        i2.executa();

        // executando usando LAMBA
        InterfaceServico i3 = () -> {
            System.out.println("EXECUTANDO USANDO LAMBDA");
        };
        i3.executa();

    }
}
