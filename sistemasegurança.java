package aula;

import java.util.Scanner;

public class sistemasegurança {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senhaCorreta = 1234;
		int senhaDigitada;
		do {
			System.out.println("Digite a senha para acessar: ");
			senhaDigitada = ler.nextInt();
			if (senhaDigitada != senhaCorreta) {
				System.out.println("Senha incorreta! Tente novamente: ");
			}
		} while (senhaDigitada != senhaCorreta);
		System.out.println("Acesso liberado!");
		ler.close();
	}
}
