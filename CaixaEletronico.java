package aula;

import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double saldo = 1000.00;
		int opção;

		do {
			System.out.println("--- MENU CAIXA ELETRÔNICO ---");
			System.out.println("1 - Consultar saldo");
			System.out.println("2 - Depositar dinheiro");
			System.out.println("3 - Sacar dinheiro");
			System.out.println("4 - Encerrar sistema");
			System.out.println("Escolha uma opção: ");

			opção = ler.nextInt();

			switch (opção) {
			case 1:
				System.out.printf("Seu saldo atual é: R$1000", saldo);
				break;
			case 2:
				System.out.println("Digite o valor do depósito: R$ ");
				double deposito = ler.nextDouble();
				saldo += deposito;
				System.out.println("Deposito realizado com sucesso!");
				break;

			case 3:
				System.out.println("Digite o valor do saque: R$ ");
				double saque = ler.nextDouble();

				if (saque <= saldo) {
					saldo -= saque;
					System.out.println("Saque realizado! Retire as notas.");
				} else {
					System.out.println("Saldo insuficiente!");
				}
				break;

			case 4:
				System.out.println("Encerrando o sistema!");
				break;

			default:
				System.out.println("Opção inválida! Tente novamente.");
			}

		} while (opção != 4);

		ler.close();
	}
}
