package aula;

import java.util.Scanner;

public class pedidosLanchonete {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
		double total = 0;
		int quantidadeDeItens = 0;
		int opção;
		
		System.out.println("=== BEM VINDO À LANCHONETE ===");
		
		do {
			System.out.println("--- MENU DE PEDIDOS ---");
			System.out.println("1 - Hambúrger -> R$ 20");
			System.out.println("2 - Refrigerante -> R$ 8");
			System.out.println("3 - Batata frita -> R$ 15");
			System.out.println("4 - Finalizar pedido");
			System.out.println("Escolha uma opção: ");
			
			opção = Ler.nextInt();
			
			switch (opção) {
			case 1:
				total += 20;
				quantidadeDeItens++;
				System.out.println("Hambúrguer adicionado!");
				
				break;
				
			case 2:
				total += 8;
				quantidadeDeItens++;
				System.out.println("Refrigerante adicionado!");
				
				break;
				
			case 3:
				total += 15;
				quantidadeDeItens++;
				System.out.println("Batata frita adicionada!");
				
				break;
				
			case 4:
				System.out.println("Finalizando seu pedido...");
				
				break;
				
				default:
					System.out.println("Opção inválida! Tente novamente.");
			}
			
		} while (opção != 4);
		
		if (total > 100) {
			double desconto = total * 0.10;
			
			total -= desconto;
			
			System.out.println("Desconto de 10% aplicado!");
		}
		
		System.out.println("RESUMO DO PEDIDO:");
		System.out.println("Quantidade de itens: " + quantidadeDeItens);
		System.out.printf("Valor final a pagar: R$ %.2f\n", total);
		
		
		Ler.close();
	}
	
}
