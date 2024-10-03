package aplicacao;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametro1 = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametro2 = terminal.nextInt();

		int numeroMaximoDaContagem = 0;
		try {
			numeroMaximoDaContagem = contarAte(parametro1, parametro2);
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();
		}

		int soma = -1;
		soma = contar(numeroMaximoDaContagem);

		System.out.println("Soma: " + soma);

		terminal.close();

	}

	public static int contar(int numMaxDaContagem) {
		int soma = 0;
		for (int i = 1; i <= numMaxDaContagem; i++) {
			soma = soma + i;
		}

		return soma;

	}

	public static int contarAte(int parametro1, int parametro2) throws ParametrosInvalidosException {
		try {
			if (parametro2 < parametro1) {
				throw new ParametrosInvalidosException(parametro1, parametro2);
			}
			// return parametro2 - parametro1;
		} catch (ParametrosInvalidosException e) {
			e.printStackTrace();

		}
		return parametro2 - parametro1;
	}

}
