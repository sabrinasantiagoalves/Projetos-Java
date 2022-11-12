package base;

public class MeuSistema {

    public static void main(String[] args) {
        InterfaceBD ibd;

        //INSTANCIANDO A CLASSE QUE FAZ A LOGICA DO ALGORITMO
        ibd = new BDAcesso();

        ibd.conectar();
        ibd.executar("SELECT * FROM tab_clientes");
        ibd.desconectar();

    }
}
