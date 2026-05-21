import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int n = sc.nextInt();
        
        for(int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
        sc.close();
    }
}