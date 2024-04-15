package exercicios9;

import java.util.Scanner;

public class Exercicio10Lista9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o dividendo:");
		int dividendo = sc.nextInt();

		System.out.println("Digite o divisor:");
		int divisor = sc.nextInt();

		int quociente = 0;

		while (dividendo >= divisor) {
			dividendo -= divisor;
			quociente++;
		}
		System.out.println("O quociente da divisão é: " + quociente);

		sc.close();
	}
}
