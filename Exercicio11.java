import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();
        
        System.out.println("Antecessor: " + (n - 1));
        System.out.println("Sucessor: " + (n + 1));
        System.out.println("Dobro: " + (n * 2));
        System.out.println("Metade: " + (n / 2.0));
        sc.close();
    }
}