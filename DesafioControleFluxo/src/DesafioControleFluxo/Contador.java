package DesafioControleFluxo;
import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o primeiro parâmetro: ");
		int parametroUm = input.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int parametroDois = input.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println("O SEGUNDO PARÂMETRO DEVE SER MAIOR QUE O PRIMEIRO!");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if (parametroUm>parametroDois) {
			System.out.println("O primero parâmetro é maior que o segundo!");
			throw new ParametrosInvalidosException();
			
		}
		int contagem = parametroDois - parametroUm;
		for (int n = 0; n < contagem; n++) {
		}	
	}

}
