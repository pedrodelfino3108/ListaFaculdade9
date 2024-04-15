package exercicios9;

public class Exercicio4Lista9 {
	public static void main(String[] args) {
		long GraosTotais = calculo_de_graos();
		System.out.println("O total de grãos de trigo no tabuleiro de xadrez é: " + GraosTotais);
	}

	public static long calculo_de_graos() {
		long graos_totais = 0;
		long quadroAnterior = 1;

		for (int quadro = 0; quadro < 64; quadro++) {
			graos_totais += quadroAnterior;
			quadroAnterior *= 2;
		}

		return graos_totais;
	}
}
