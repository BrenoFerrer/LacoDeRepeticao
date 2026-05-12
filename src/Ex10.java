import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        //declaração de variavel

        int voto = 1;
        int candidato1 = 0;
        int candidato2 = 0;
        int candidato3 = 0;
        int votosinvalidos = 0;

        int total;

        double pc1, pc2, pc3;





        Scanner ent = new Scanner(System.in);

        //Laço de Repetição

        while (voto != 0){
            System.out.println(" [1] - Candidato 1\n [2] - Candidato 2\n [3] - Candidato 3\n [0] - Finalizar" );
            voto = ent.nextInt();

            if (voto == 0){
                break;
            }

            if (voto == 1){
                candidato1++;
            }

            else if (voto == 2){
               candidato2++;

            }

            else if (voto ==3) {
             candidato3 ++;
            }

            else {
            votosinvalidos++;
            }

        }
        System.out.println("Candidato 1 = "+candidato1);
        System.out.println("Candidato 2 = "+candidato2);
        System.out.println("Candidato 3 = "+candidato3);
        System.out.println("Votos Inválidos = " +votosinvalidos);

        //Calcular o total de votos


    }
}
