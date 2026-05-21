import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o coeficiente a: ");
        double a = sc.nextDouble();
        System.out.print("Informe o coeficiente b: ");
        double b = sc.nextDouble();
        System.out.print("Informe o coeficiente c: ");
        double c = sc.nextDouble();
        
        double delta = Math.pow(b, 2) - (4 * a * c);
        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.printf("As raízes da equação são: x' = %.2f e x'' = %.2f\n", x1, x2);
        sc.close();
    }
}