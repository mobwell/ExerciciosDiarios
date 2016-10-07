package exercicios071016;

import java.util.Random;
import java.util.Scanner;

public class Treino {
	public Treino() {
		exercicio3();
	}

	private void exercicio1() {
		System.out.println("Introduza o primeiro número");
		int num1 = (new Scanner(System.in)).nextInt();
		System.out.println("Introduza o segundo número");
		int num2 = (new Scanner(System.in)).nextInt();
		
		if (num1 > num2) {
			System.out.println("O número maior é o primeiro");
		} else  {
			System.out.println("O número maior é o segundo");
		}
		
	}
	
	private void exercicio3() {
		int rand = (new Random()).nextInt(5);
		
		for (int i=0; i < 5; i++) {
			System.out.println("Escolha um número aleatório entre 1 e 5");
			int num = (new Scanner(System.in)).nextInt();
			if (num == rand) {
				System.out.println("Acertou no número à " + (i+1) + " tentativa!");
				break;
			}
			System.out.println("Tem " + (i+1) + " tentativas");
		}	
	}
}
