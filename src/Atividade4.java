import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] participantes = {"Taffismo Club", "Patinho Branquinho", "Lucas FC", "Sport redes FC"};
        int[] votos = new int[4];

        System.out.println("Quantos irão votar??");
        int quantVotos = sc.nextInt();

        for (int i = 0; i < quantVotos; i++) ;
        System.out.println("\n Candidatos");
        System.out.println("\n 10 Taffismo Club");
        System.out.println("\n 20 Patinho Branquinho");
        System.out.println("\n 30 Lucas FC");
        System.out.println("\n 40 Sport redes FC");

        int voto;
        do {
            System.out.println("Escreva o numero do time");
            voto = sc.nextInt();

            switch (voto) {
                case 10:
                    votos[0]++;
                    break;
                case 20:
                    votos[1]++;
                    break;
                case 30:
                    votos[2]++;
                    break;
                case 40:
                    votos[3]++;
                    break;
                default:
                    System.out.println("Número invalido!");

            }
        } while (voto != 40 && voto != 30 && voto != 20 && voto != 10) ;
            System.out.println("\n Resultado dos votos: ");

            for (int i = 0; i < participantes.length; i++) {
                System.out.println(participantes[i]);
            }

            int todosVotos = 0;
            String Ganhador = "";
            for (int i = 0; i < participantes.length; i++) {
                if (votos[i] > todosVotos) {
                    todosVotos = votos[i];
                    Ganhador = participantes[i];

                }
            }
            System.out.println("O ganhador é: " + Ganhador);
        }
    }



