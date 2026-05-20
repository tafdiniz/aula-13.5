package aula;

import java.util.Scanner;

public class guerreiro {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vida = 100;
		int dano;
		
		System.out.println("INÍCIO DA BATALHA!");
		System.out.println("Vida inicial: " + vida);
		
		do {
			System.out.println("Informe o dano recebido: ");
			dano = ler.nextInt();
			
			vida -= dano;
			
			if (vida < 0) {
				vida = 0;
			}
			System.out.println("Vida restante: " + vida);
		
			} while (vida > 0);
		
		System.out.println("------ GAME OVER --------");
		
		ler.close();
		
	}
}
