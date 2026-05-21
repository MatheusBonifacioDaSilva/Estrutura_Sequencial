import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();
        System.out.print("Informe o salário do funcionário: ");
        double salarioFuncionario = sc.nextDouble();
        
        double qtdSalarios = salarioFuncionario / salarioMinimo;
        System.out.printf("O funcionário ganha %.2f salários mínimos.\n", qtdSalarios);
        sc.close();
    }
}