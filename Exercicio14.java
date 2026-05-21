import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor da variável A: ");
        int a = sc.nextInt();
        System.out.print("Informe o valor da variável B: ");
        int b = sc.nextInt();
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("Valores invertidos:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        sc.close();
    }
}