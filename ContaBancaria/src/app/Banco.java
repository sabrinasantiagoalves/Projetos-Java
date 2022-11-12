package app;
import nucleo.DadosConta;

import java.util.Scanner;
// Nunca printar coisas dentro de classes que armazenam dados, sempre interagir com o usuario somente na Main e a main chama os métodos!

public class Banco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int opcao;
        double valor;

        // passando os parametros de criação de uma conta

        DadosConta conta = new DadosConta(1001,2,"Sabrina","123.456.859-09",500.0);

        do {
            System.out.println("Bem vindo ao Banco onde você pode ser o que quiser! BankofPower \n");
            System.out.println("Digite 1 - Depósito / 2 - Saque / 3 - Informação / 0 - Sair");
            opcao = teclado.nextInt(); // lendo a opcao digitada

            switch (opcao){
                case 1:
                    System.out.println("Você escolheu a opção depósito. Por favor, digite o valor: ");
                    valor = teclado.nextDouble(); // usuario informa o valor
                    conta.despositar(valor); // chama o metodo depositar
                    break;
                case 2:
                    System.out.println("Você escolheu a opção de saque. Por favor, informe o valor: ");
                    valor = teclado.nextDouble();
                    boolean res = conta.sacar(valor);

                    if (res){
                        System.out.println("Saque efetuado!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu Informações :" + conta.exibirDados());
                    break;
                case 0:
                    System.out.println("Obrigada por escolher o BankOfPower!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        teclado.close();
    }





}
