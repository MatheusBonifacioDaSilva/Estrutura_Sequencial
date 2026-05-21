import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe a diagonal maior do losango: ");
        double diagonalMaior = sc.nextDouble();
        System.out.print("Informe a diagonal menor do losango: ");
        double diagonalMenor = sc.nextDouble();
        
        double area = (diagonalMaior * diagonalMenor) / 2.0;
        System.out.printf("A área do losango é: %.2f\n", area);
        sc.close();
    }
}