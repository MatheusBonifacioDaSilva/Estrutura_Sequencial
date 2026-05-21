import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três números inteiros:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        
        double media = (n1 + n2 + n3) / 3.0;
        System.out.printf("A média aritmética é: %.2f\n", media);
        sc.close();
    }
}