package userinterface;

import model.*;

public class FolhaDePagamento {
    public static void main(String[] args) {
        Funcionario f1,f2,f3,f4;

        f1 = new Chefe(1234,"Ana");
        f2 = new Comissionado(2514,"Mario",2500,1520);
        f3 = new Horista(1478,"Pedro",15,25.30);
        f4 = new Empreiteiro(2564,"Sandra",5600);

        System.out.println(f1.getNumRegistro()+" - " + f1.getNome() + " - R$ "+ f1.calcularSalario());
        System.out.println(f2.getNumRegistro()+" - " + f2.getNome() + " - R$ "+ f2.calcularSalario());
        System.out.println(f3.getNumRegistro()+" - " + f3.getNome() + " - R$ "+ f3.calcularSalario());
        System.out.println(f4.getNumRegistro()+" - " + f4.getNome() + " - R$ "+ f4.calcularSalario());
    }
}
