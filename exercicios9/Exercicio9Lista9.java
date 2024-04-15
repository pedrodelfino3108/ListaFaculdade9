package exercicios9;

import java.util.Scanner;

public class Exercicio9Lista9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;

		System.out.println("Digite valores inteiros positivos (digite um número negativo para parar):");

		int valor = scanner.nextInt();

		while (valor >= 0) {
			if (valor > maior) {
				maior = valor;
			}
			if (valor < menor) {
				menor = valor;
			}

			valor = scanner.nextInt();
		}

		if (maior != Integer.MIN_VALUE && menor != Integer.MAX_VALUE) {
			System.out.println("Maior valor informado: " + maior);
			System.out.println("Menor valor informado: " + menor);
		} else {
			System.out.println("Nenhum valor positivo foi informado.");
		}

		scanner.close();
	}
}
