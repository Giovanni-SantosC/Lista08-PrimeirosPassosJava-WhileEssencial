package lista08;

import java.util.Scanner;

public class Ex06MediaNotas1a10 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Media de Numeros de 1 a 10: ");
		System.out.println("Para esse Programa Parar Digite um Numero Menor que 0 ou Maior que 10!:");
		
		boolean teste = true;
		float notas = 0;
		int contagemMedia = 0;
		
		while(teste) {
			
			System.out.println("Insira o Valor: ");
			float nota = sc.nextFloat();
			
			if(nota < 0) {
				teste = false;
			}
			
			if(nota > 10) {
				teste = false;
			}
			
			if(nota >= 0 && nota < 11){
				notas += nota;
				contagemMedia++;
			}
			
	}
		float media = notas / contagemMedia;
		System.out.println("A Media de Todos as Notas Insiridas é: " + media);
	
	
		sc.close();
}
}
