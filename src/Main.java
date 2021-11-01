import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		
		/* Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente me Fahrenhei. Perguntar se o usuário deseja
		 repetir (s / n). Caso o usuário digite "s", repetir o programa.
		 fórmula: F = 9C / 5 +32. Exemplo: 1- digite a temperatura em Celsius: 30; 2- equivalente em Fahrenheit: 86,0
		 Deseja repeir (s / n)? */
		   Locale.setDefault(Locale.US);
		   Scanner sc = new Scanner(System.in);
		   System.out.print("Digite a temperatura em Celsius: ");
		   double C= sc.nextDouble();
		   double F= 9.0*C/5.0 +32.0;
		   System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
		   System.out.print("Deseja repetir (s/n)?");
		   char resposta= sc.next().charAt(0);
		   
		   while(resposta != 'n') {
			   System.out.print("Digite a temperatura em Celsius: ");
			   C= sc.nextDouble();
			   F= 9.0*C/5.0 +32.0;
			   System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			   System.out.print("Deseja repetir (s/n)?");
			   resposta= sc.next().charAt(0);
			   
		   }
		   
		   sc.close();
		 
			
	}

}
