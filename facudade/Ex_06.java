import java.util.Scanner;


public class Ex_06 {

	public static void main(String[] args) {
		
		int x; 
		double y;
		
		double valor;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Informe a distância percorrida"); 
		x = numero.nextInt(); 
		
		System.out.println("Informe o combustível gasto ?");
		y = numero.nextDouble(); 
		
		valor = x / y;
		
		System.out.printf("O consumo médio de um automóvel é de: %.2f km/h",  valor);
	numero.close();
	}

}