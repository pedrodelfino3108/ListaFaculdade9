package exercicios9;

import java.util.Scanner;

public class Exercicio5Lista9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = 0;

		System.out.println("Digite 15 valores numéricos inteiros:");
		for (int i = 0; i < 15; i++) {
			System.out.println("Valor " + (i + 1) + ": ");

			int valor = sc.nextInt();
			total += calculo_fatorial(valor);

		}

		System.out.println("O total do somatório das fatoriais é: " + total);
		sc.close();
	}
	public static int calculo_fatorial(int n) {
		int fatorial = 1;
		for(int i = 1; i <= n; i++) {
			fatorial *=i;
		}
		
		return fatorial;
	}
}
