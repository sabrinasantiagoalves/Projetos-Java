package base;

public class BDAcesso implements InterfaceBD {

    @Override
    public void conectar() {
        //inserir a logica do que deve acontecer
        System.out.println("Conectando com o Banco de Dados");
    }

    @Override
    public void desconectar() {
        System.out.println("Desconectando do Banco de Dados");
    }

    @Override
    public void executar(String comando) {
        System.out.println("Sua conexão foi bem sucedida!");

    }
}
