[23:41, 02/10/2022] Leonardo Barbosa: import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		System.out.println("Informe um número para a sua tabuada: ");
		n = sc.nextInt(); 
		
		for(i = 0; i < 10; i++) {
			
			System.out.printf(" %d * %d = %d \n", i, n, (i * n));
		sc.close();}
		
	}

}
[23:41, 02/10/2022] Leonardo Barbosa: import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		int a, b, c; 
		
		System.out.println("informe um número para a letra A: "); 
		a = sc.nextInt(); 
		
		System.out.println("Informe um número para a letra B: "); 
		b = sc.nextInt(); 
		
		System.out.println("Informe um número para a letra C: "); 
		c = sc.nextInt(); 
		
		if(a + b > c && b + c > a && c + a > b) {
			
			if(a == b && b == c) {
				
				System.out.println("Equilátero"); 
				
			} else if(a == b || b == c || c == a) {
				
				System.out.println("Isósceles"); 
				
			} else {
				
				System.out.println("Escaleno");
			}
			
		} else {
			
			System.out.println("Valores não formam um triângulo");
		}
sc.close();	}

}