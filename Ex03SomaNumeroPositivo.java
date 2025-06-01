package lista08;

import java.util.Scanner;

public class Ex03SomaNumeroPositivo {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Soma de Numeros Positivos: ");
		System.out.println("Digite um Numero Negativo para Parar o Programa!");
		System.out.println("Digite um Valor: ");
		float numero = sc.nextFloat();
		float soma = 0;
		
		while(numero > 0) {
			soma += numero;
			System.out.println("Digite um Valor: ");
			numero = sc.nextFloat();
		}
		
		if(numero < 0) {
			System.out.println("A Soma de Todos os Numeros Positivos é: " + soma);
		}
		
		sc.close();
	}
	
	
}
