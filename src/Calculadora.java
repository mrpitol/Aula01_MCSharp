import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		double valor1;
		double valor2;
		double soma, divisao, multiplicacao, subtracao;
		System.out.println("Por favor, digite um valor:");
		//N�o pode ser apenas next() pois o next() � string ent�o conflita o double 
		valor1 = leitor.nextDouble();
		System.out.println("Por favor, digite outro valor:");
		valor2=leitor.nextDouble();
		//Adi��o
		soma = valor1+valor2;
		System.out.println("A soma dos dois valores informados �: "+soma);
		leitor.close();
		//Subtra��o
		subtracao=valor1-valor2;
		System.out.println("A subtra��o dos dois valores informados �: "+subtracao);
		//multiplica��o
		multiplicacao=valor1*valor2;
		System.out.println("A multiplica��o dos dois valores informados �: "+multiplicacao);
		//divisao
		divisao=valor1/valor2;
		System.out.println("A divisao dos dois valores informados �: "+divisao);
		
		
	}

}
