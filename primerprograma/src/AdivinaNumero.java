import java.util.Random;
import java.util.Scanner;

public class AdivinaNumero {
    public static void main(String[] args) {
        int numeroAleatorio = new Random().nextInt(100);
        Scanner numeroUsuario = new Scanner(System.in);
        int intento;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Ingresa tu intento número " + i);
            intento = numeroUsuario.nextInt();
         if (intento == numeroAleatorio)
         {
             System.out.println("¡Acertaste!");
             break;
         }
         else if (Math.abs(intento - numeroAleatorio) <= 10 &&
                 intento < numeroAleatorio) //Math.abs para valor absoluto
         {
             System.out.println("El número está más arriba, pero estás muy cerca");
         }
         else if (Math.abs(intento - numeroAleatorio) <= 10 &&
                 intento > numeroAleatorio) //Math.abs para valor absoluto
         {
             System.out.println("El número está más abajo, pero estás muy cerca");
         }
         else if (Math.abs(intento - numeroAleatorio) > 10 &&
                 intento < numeroAleatorio) //Math.abs para valor absoluto
         {
             System.out.println("El número está más arriba, y estás lejos");
         }
         else if (Math.abs(intento - numeroAleatorio) > 10 &&
                 intento > numeroAleatorio) //Math.abs para valor absoluto
         {
             System.out.println("El número está más abajo, y estás lejos");
         }
        }
        System.out.println("El número era " + numeroAleatorio);
    }
}
