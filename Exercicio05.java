import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a temperatura em Celsius: ");
        double c = sc.nextDouble();
        
        double f = (c * 1.8) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F\n", f);
        sc.close();
    }
}