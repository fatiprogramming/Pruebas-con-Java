import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluaciones = 0;
        double totalEvaluaciones = 0;

        do {
            System.out.println("Ingrese nota");
            nota = notas.nextDouble();
            if (nota != -1){
            mediaEvaluaciones += nota;
            totalEvaluaciones++;}
        }
        while (nota != -1);


        System.out.println("La nota media para Matrix es: " +
                mediaEvaluaciones/totalEvaluaciones);
    }
}
