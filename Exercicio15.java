import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o número total de eleitores: ");
        int totalEleitores = sc.nextInt();
        
        System.out.print("Informe o número de votos do 1º candidato: ");
        int votosCandidato1 = sc.nextInt();
        
        System.out.print("Informe o número de votos do 2º candidato: ");
        int votosCandidato2 = sc.nextInt();
        
        int votosNulos = totalEleitores - (votosCandidato1 + votosCandidato2);
        
        double percCandidato1 = (votosCandidato1 * 100.0) / totalEleitores;
        double percCandidato2 = (votosCandidato2 * 100.0) / totalEleitores;
        double percNulos = (votosNulos * 100.0) / totalEleitores;
        
        System.out.printf("Percentual do Candidato 1: %.2f%%\n", percCandidato1);
        System.out.printf("Percentual do Candidato 2: %.2f%%\n", percCandidato2);
        System.out.printf("Percentual de votos nulos: %.2f%%\n", percNulos);
        
        sc.close();
    }
}