package lista08;

import java.util.Scanner;

public class Ex08ContadorDeVogais {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Contagem de Vogais: ");
		System.out.println("Digite uma Palavra:");
		String palavra = sc.nextLine();
		
		palavra = palavra.toLowerCase();
		
		int contadora = 0;
		int contadorVogais = 0;
		
		while(contadora < palavra.length()) {
			char caracterAtual = palavra.charAt(contadora);
			
			if(caracterAtual == 'a' || caracterAtual == 'e' || caracterAtual == 'i' || caracterAtual == 'o' || caracterAtual == 'u') {
				contadorVogais++;
			}
			
			contadora++;
		}
		
		System.out.println("a Palavra Contem " + contadorVogais + " Vogais.");
		
		sc.close();
	}
	
}
