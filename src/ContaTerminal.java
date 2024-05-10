import models.ContaBancaria;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {


        ContaBancaria contaBancaria = new ContaBancaria();
        Scanner terminal = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência !");
        contaBancaria.setAgencia(String.valueOf(terminal.nextInt()));
        System.out.println("Por favor, digite o número da conta !");
        contaBancaria.numero = terminal.nextInt();
        System.out.println("Por favor, digite o nome do cliente !");
        terminal.nextLine();
        contaBancaria.nomeCliente = terminal.nextLine();
        System.out.println("Por favor, digite o Saldo disponível !");
        contaBancaria.saldo = Double.valueOf(terminal.next());
        System.out.println(contaBancaria);
        terminal.close();

    }
}