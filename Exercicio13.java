import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a altura da mulher (em metros, ex: 1,65): ");
        double altura = sc.nextDouble();
        
        double pesoIdeal = (62.1 * altura) - 44.7;
        System.out.printf("O peso ideal é: %.2f kg\n", pesoIdeal);
        sc.close();
    }
}