package aula;

import java.util.Scanner;

public class CorridaDeCarros {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);

		int distanciaA = 0;
		int distanciaB = 0;
		int rodada = 1;

		do {
			System.out.println("\n--- RODADA " + rodada + " ---");

			System.out.print("Metros percorridos pelo Carro A: ");

			distanciaA += Ler.nextInt();
			System.out.print("Metros percorridos pelo Carro B: ");

			distanciaB += Ler.nextInt();

			if (distanciaA > distanciaB) {
				System.out.println("Liderança: Carro A está na frente!");

			} else if (distanciaB > distanciaA) {

				System.out.println("Liderança: Carro B está na frente!");

			} else {

				System.out.println("Liderança: Os carros estão empatados!");

			}
			System.out.println("Posição Atual -> A: " + distanciaA + "m | B: " + distanciaB + "m");

			rodada++;

		} while (distanciaA < 100 && distanciaB < 100);

		// Resultado Final
		System.out.println("Distância Final Carro A: " + distanciaA + "m");

		System.out.println("Distância Final Carro B: " + distanciaB + "m");

		if (distanciaA >= 100 && distanciaB >= 100) {

			System.out.println("RESULTADO: EMPATE! Ambos cruzaram a linha.");

		} else if (distanciaA >= 100) {

			System.out.println("VENCEDOR: CARRO A!");

		} else {

			System.out.println("VENCEDOR: CARRO B!");

		}

		Ler.close();
	}
}
