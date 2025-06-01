package lista08;

import java.util.Scanner;

public class Ex09NumeroFatorial {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Numero Fatorial: ");
		System.out.println("Digite um Valor:");
		
		int numero = sc.nextInt();
		int contadora = 1;
		int fatorial = 1;
		
		while(contadora <= numero) {
			
			fatorial = fatorial * contadora;
		contadora++;	
		}
		
		System.out.println("O Fatorial de " + numero + " e " + fatorial);
		
		sc.close();
	}
	
}
