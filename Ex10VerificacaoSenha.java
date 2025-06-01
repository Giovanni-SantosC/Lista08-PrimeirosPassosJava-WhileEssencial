package lista08;

import java.util.Scanner;

public class Ex10VerificacaoSenha {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Verificação de Senha: ");
		System.out.println("Digite uma Senha: ");
		String senha = sc.nextLine();
		
		boolean teste = true;
		
		while(teste) {
			
			System.out.println("Digite a Senha Novamente: ");
			String senhaDigitada = sc.nextLine();
			
			if(!senhaDigitada.equals(senha)) {
				System.out.println("Senha Digitada Errada.");
				teste = true;
			}
			
			else if(senhaDigitada.equals(senha)){
				System.out.println("Senha Digitida Esta Correta! ");
				teste = false;
			}
		}
		
		
		
		sc.close();
	}
	
}
