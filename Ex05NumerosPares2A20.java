package lista08;

public class Ex05NumerosPares2A20 {

	public static void main(String[]args) {
		
		int contadora = 1;
		int contagemNumerosPares = 0;
		
		System.out.println("Numeros Pares de 2 a 20:");
		
		while(contadora < 21) {
			
			if(contadora % 2 == 0) {
				System.out.println(contadora);
				contagemNumerosPares++;
			}
			
			contadora++;
		}
		
		System.out.println("A Quantidade de Numeros Pares é: " + contagemNumerosPares);
	}
	
}
