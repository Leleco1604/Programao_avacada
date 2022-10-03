import java.util.Scanner;

public class Ex_01 {
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("Qual é a sua primeira nota?");
	double a = leitor.nextDouble();
	
	System.out.println("Qual é a sua segunda nota?");
	double b = leitor.nextDouble();
	
	
	
	double media = ((3.5 * a) + (7.5 * b))/11;
	
	
	
	System.out.println(String.format("Sua MEDIA é = %.5f" , media));
	
	leitor.close();
	
	}
	
	
	
}