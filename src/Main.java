import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		/* for=para (Fazer um programa que lê o valor inteiro N vezes.
		 depois N números inteiros. Ao final, mostra a soma dos N números lidos.)*/
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int soma = 0;
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		
		System.out.println(soma);
		sc.close();
		
			

	}

}
