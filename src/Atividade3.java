import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos deseja avaliar");
        int quant = sc.nextInt();

        double[] comidas = new double[quant];

        for (int i = 0; i < quant; i++){
            double avaliacao;
            do {
                System.out.println("Dê uma nota à comida" + (i + 1) + " de 0 a 10.");
                avaliacao = sc.nextDouble();
                if (avaliacao < 0 || avaliacao > 10){
                    System.out.println("Avaliação invalida");
                }

            } while (avaliacao < 0 || avaliacao > 10);
            comidas[i] = avaliacao;

            }

        double soma = 0;
        int boas = 0, ruins = 0;
        for (double avaliacao : comidas) {
            soma += avaliacao;
            if (avaliacao >= 6){
                boas++;
            } else {
                ruins++;
            }

        }
        double media = soma / quant;
        System.out.println("\n Média das avaliações: "+media);
        System.out.println("\n Quantidade de comidas ruins: "+ruins);
        System.out.println("\n Quantidade de comidas boas: "+boas);
    }


}

