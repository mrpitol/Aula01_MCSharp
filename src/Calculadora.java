import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1;
		double valor2;
		double soma;
		System.out.println("Por favor digite um valor:");
		//N�o pode ser next() pois o next() � string ent�o conflita o double 
		valor1 = leitor.nextDouble();
		System.out.println("Por favor digite outro valor:");
		valor2=leitor.nextDouble();
		//Adi��o
		soma = valor1+valor2;
		System.out.println("A soma dos dois valores informados �: "+soma);
		leitor.close();
	}

}
