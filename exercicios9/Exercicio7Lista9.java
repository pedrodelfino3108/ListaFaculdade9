package exercicios9;

public class Exercicio7Lista9 {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				int fatorial = calcularFatorial(i);
				System.out.println("Fatorial de " + i + ": " + fatorial);
			}

		}
	}

	public static int calcularFatorial(int n) {
		int fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}