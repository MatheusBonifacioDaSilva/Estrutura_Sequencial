import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a cotação do dólar: ");
        double cotacao = sc.nextDouble();
        System.out.print("Informe o valor que possui em dólares: ");
        double dolares = sc.nextDouble();
        
        double reais = cotacao * dolares;
        System.out.printf("O valor em reais é: R$ %.2f\n", reais);
        sc.close();
    }
}