package exercicios9;

import java.util.Scanner;

public class Exercicio6Lista9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = 0;
		int valores = 0;
		int valor;

		System.out.println("Digite valores numéricos (digite um número negativo para parar):");

		do {
			System.out.print("Valor: ");
			valor = sc.nextInt();

			if (valor >= 0) {
				total += valor;
				valores++;
			}
		} while (valor >= 0);

		double media = valores > 0 ? (double) total / valores : 0;

		System.out.println("Total do somatório: " + total);
		System.out.println("Média aritmética: " + media);
		System.out.println("Total de valores lidos: " + valores);

		sc.close();

	}
}
