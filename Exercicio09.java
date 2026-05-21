import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número positivo: ");
        double n = sc.nextDouble();
        
        if (n > 0) {
            System.out.printf("Ao quadrado: %.2f\n", Math.pow(n, 2));
            System.out.printf("Ao cubo: %.2f\n", Math.pow(n, 3));
            System.out.printf("Raiz quadrada: %.2f\n", Math.sqrt(n));
            System.out.printf("Raiz cúbica: %.2f\n", Math.cbrt(n));
        } else {
            System.out.println("O número não é positivo.");
        }
        sc.close();
    }
}