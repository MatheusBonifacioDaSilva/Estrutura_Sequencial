import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor gasto pelo cliente: ");
        double valorGasto = sc.nextDouble();
        
        double gorjeta = valorGasto * 0.10;
        System.out.printf("O valor a ser pago de gorjeta é: R$ %.2f\n", gorjeta);
        sc.close();
    }
}