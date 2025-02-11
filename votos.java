import java.util.Scanner;

public class votos {
    public static void votos(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosNulos = 0; 
        int totalVotos = 0;
        System.out.println("Ingrese los votos:");
        while (true) {
            int voto = scanner.nextInt();

            if (voto == 0) {
                break; 
            }
            switch (voto) {
                case 1:
                    votosCandidato1++;
                    break;
                case 2:
                    votosCandidato2++;
                    break;
                case 3:
                    votosCandidato3++;
                    break;
                default:
                    votosNulos++;
                    break;
            }
            totalVotos++;
        }
        if (totalVotos == 0) {
            System.out.println("No se ingresaron votos.");
            return;
        }
        double porcentajeCandidato1 = (votosCandidato1 * 100.0) / totalVotos;
        double porcentajeCandidato2 = (votosCandidato2 * 100.0) / totalVotos;
        double porcentajeCandidato3 = (votosCandidato3 * 100.0) / totalVotos;
        double porcentajeNulos = (votosNulos * 100.0) / totalVotos;

        System.out.println("Resultados de la votación:");
        System.out.printf("Candidato 1: %.2f%% de los votos\n", porcentajeCandidato1);
        System.out.printf("Candidato 2: %.2f%% de los votos\n", porcentajeCandidato2);
        System.out.printf("Candidato 3: %.2f%% de los votos\n", porcentajeCandidato3);
        System.out.printf("Votos nulos: %.2f%% de los votos\n", porcentajeNulos);
    }
}