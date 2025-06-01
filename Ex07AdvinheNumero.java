package lista08;

import java.util.Scanner;
import java.util.Random;

public class Ex07AdvinheNumero {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int numeroSecreto = random.nextInt(10) + 1;
		boolean teste = true;
		int contadorTentativas = 0;
		
		System.out.println("Adivinhe o Valor de 1 a 10:");
		
		while(teste) {
			
			System.out.println("Digite um Valor:");
			int valor = sc.nextInt();
			
			if(valor > numeroSecreto) {
				System.out.println("Digite um Valor Menor.");
				contadorTentativas++;
				teste = true;
			}
			
			else if(valor < numeroSecreto) {
				System.out.println("Digite um Valor Maior. ");
				contadorTentativas++;
				teste = true;
			}
			
			else if(valor == numeroSecreto) {
				contadorTentativas++;
				System.out.println("Parabens Você Acertou!!");
				System.out.println("O Valor era " + valor + " é a Quantidade de Tentativas foi: " + contadorTentativas );
				teste = false;
			}
			
			
		}
		
		sc.close();
	}
	
}
