package exercicios9;

public class Exercicio2Lista9 {
	public static void main(String[] args) {
		int soma = 0;

		for (int i = 2; i <= 500; i += 2) {
			soma += i;
		}
		System.out.println("O somatório dos valores pares de 1 até 500 é: " + soma);
	}
}
