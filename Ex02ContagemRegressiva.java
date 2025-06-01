package lista08;

import java.util.Scanner;

public class Ex02ContagemRegressiva {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Contagem Regressiva");
		
		System.out.println("Digite um valor: ");
		int numero = sc.nextInt();
		
		while(numero >= 0) {
			
			System.out.println(numero);
			
			numero-- ;
		}
		
		
		
		sc.close();
	}
	
}
