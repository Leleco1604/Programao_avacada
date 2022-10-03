import java.util.Scanner;
public class Ex_02 {

public static void main(String[] args) {
Scanner s = new Scanner(System.in);

System.out.println("Qual é a seu número");
int numero = s.nextInt();

System.out.println("Quantas horas você trabalha?");
int horas = s.nextInt();

System.out.println("Qual é o valor da sua hora? ");
double salario = s.nextDouble();
double salariohora = salario*horas ;
System.out.println("NÚMERO = " + numero);
System.out.println(String.format("Salario = U$ %.2f" , salariohora));
System.out.println("Hello");
s.close();
}

}