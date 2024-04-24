package com.dio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner inLine = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência: ");
        Integer numero = in.nextInt();

        System.out.println("Por favor, digite o nome da agência: ");
        String agencia = inLine.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        String cliente = inLine.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        Double saldo = in.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, cliente, saldo);

        System.out.printf(
                "\nOlá %s, obrigado por criar uma conta no nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível",
                conta.getNomeCliente(), conta.getAgencia(), conta.getNumero(), conta.getSaldo());
    }
}