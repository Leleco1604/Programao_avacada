import java.util.Scanner;

public class Ex_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double popA; 
		double popB;
		
		double contador = 0; 
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe a Taxa de População do país A: "); 
		popA = sc.nextDouble(); 
		
		System.out.println("Informe a Taxa de População do país B: "); 
		popB = sc.nextDouble(); 
		
		while(popB > popA) {
			
			popA += (popA * 3) / 100; 
			popB += (popB * 1.5) / 100; 
			
			contador++; 
		}
		
		System.out.println("Taxa de Anos da População: " + contador + " anos.");
	sc.close();
	}

}
[23:31, 02/10/2022] Leonardo Barbosa: import java.util.Scanner;

public class Ex_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		int n; 
		int j = 0; 
		
		System.out.println("Informe um número: "); 
		n = sc.nextInt(); 
		
		while(n > j) {
			
			j *= 10;
			j += (n % 10); 
			n /= 10; 
			
		}
		
		System.out.println("Número invertido: " + j);
		sc.close();
	}

}