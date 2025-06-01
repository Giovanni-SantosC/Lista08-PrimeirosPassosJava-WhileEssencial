package lista08;

import java.util.Scanner;

public class Ex04Tabuada1A10 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tabuada de 1 A 10 do Valor Inserido:");
		System.out.println("Digite um Valor Inteiro:");
		int numero = sc.nextInt();
		int contadora = 1;
		
		while(contadora < 11) {
			
			int multiplicacao = numero * contadora;
			System.out.println(numero + " X " + contadora + " = " + multiplicacao);
			
			contadora++;
		}
		
		sc.close();
	}
	
	
	
	
}
