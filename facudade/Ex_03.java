import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex_03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double SALARIO, VENDAS, TOTAL;


        SALARIO = input.nextDouble();

        VENDAS = input.nextDouble();

        TOTAL = SALARIO + VENDAS * 0.15;

         System.out.println("TOTAL = R$ " + df.format(TOTAL));
   
   input.close();
        }

}