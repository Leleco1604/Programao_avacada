import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		
		int maior; 
		int a, b, c; 
		int menor; 
		
		Scanner letra = new Scanner(System.in); 
		
		System.out.println("Informe um número para letra a: ");
		a = letra.nextInt(); 
		
		System.out.println("Informe um número para letra b: ");
		b = letra.nextInt();
		
		System.out.println("Informe um número para letra c: ");
		c = letra.nextInt();
		
		maior = a; 
		
		if (b > a && b > c) {
			
			maior = b; 
			
		} else if(c > a && c > b) {
			
			maior = c;
		}
		
		menor = a; 
		

		if (b < a && b < c) {
			
			menor = b; 
			
		} else if(c < a && c < b) {
			
			menor = c;
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é : " + menor);

		letra.close();
	}
}