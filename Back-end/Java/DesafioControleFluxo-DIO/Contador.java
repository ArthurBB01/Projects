package desafioCodigo_DIO;
import java.util.Scanner;
public class Contador {

	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o prmeiro n�mero: ");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int parametroDois = terminal.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
			
		} catch (ParametrosInvalidosException exception) {
			System.out.println(exception.getMessage());
		}
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		if(parametroUm>parametroDois) {
			throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro");
		}
		else{
			int contagem = parametroDois - parametroUm;
			for (int i = 1; i <=contagem; i ++) {
				System.out.println(i);
			}
		}
	}

}
