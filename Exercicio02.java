import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = sc.nextInt();
        
        int idadeAtual = anoAtual - anoNascimento;
        int idade2050 = 2050 - anoNascimento;
        
        System.out.println("Sua idade no ano atual é: " + idadeAtual);
        System.out.println("Sua idade em 2050 será: " + idade2050);
        sc.close();
    }
}