import java.util.Scanner;

public class RecebendoDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leitor = new Scanner (System.in);
		String nome;
		System.out.println("Este Progrma L� Dados");
		System.out.println("Digite seu nome:");
		nome = leitor.next();
		System.out.println("Que legal ter voc� aqui, "+ nome);
		leitor.close();
	}

}
