package exercicios9;

import java.util.Scanner;

public class Exercicio8Lista9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double area_total = 0;
		String continuar;

		do {
			System.out.println("Digite o nome do cômodo:");
			String nomeComodo = scanner.nextLine();

			System.out.println("Digite a largura do cômodo em metros:");
			double largura = scanner.nextDouble();

			System.out.println("Digite o comprimento do cômodo em metros:");
			double comprimento = scanner.nextDouble();

			double areaComodo = calcularArea(largura, comprimento);
			System.out.println("A área do cômodo " + nomeComodo + " é: " + areaComodo + " metros quadrados");

			area_total += areaComodo;

			scanner.nextLine(); 

			System.out.println("Deseja continuar calculando novos cômodos? (S/N)");
			continuar = scanner.nextLine();
		} while (continuar.equalsIgnoreCase("SIM"));

		System.out.println("A área total da residência é: " + area_total + " metros quadrados");

		scanner.close();
	}

	public static double calcularArea(double largura, double comprimento) {
		return largura * comprimento;
	}
}
