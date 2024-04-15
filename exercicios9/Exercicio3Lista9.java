package exercicios9;

public class Exercicio3Lista9 {
	public static void main(String[] args) {
		System.out.println("Números divisíveis por 4 menores que 200");
		for (int i = 1; i < 200; i++) {
			if (i % 4 == 0) {
				System.out.println(i);
			}
		}
	}
}
