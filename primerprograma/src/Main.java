//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        for (int i = 1; i <= 5; i++) {
//
//            System.out.println("i = " + i);
//          //sout = System.out.println();
//
//        }
        //CASTING Y FORMATEO EJEMPLO
//        String nombre = "Hello";
//        double nota1 = 4.23;
//        double nota2 = -2.34;
//        int num = 3;
//       double castingEjemplo = (double) num;
//        System.out.println("""
//                This is my name %s
//                My grades are %.2f and %f
//                """.formatted(nombre, nota1, nota2));
//        System.out.println(castingEjemplo);


        //TEXT BLOCKS EXAMPLE
        /*System.out.println(String.format("%.2f",nota1/nota2) + """
                \n
                Hello
                this is real
                this is me
                I'm exactly where I'm supposed to be nowwwww""");*/
    /*Escribe un programa que convierta una temperatura
    en grados Celsius a Fahrenheit. Utiliza variables para
     representar los valores de las temperaturas e imprime
     en la consola el valor convertido de Celsius a Fahrenheit.

Consejo: La fórmula para convertir temperaturas de grados
 Celsius a Fahrenheit es: (temperatura * 1.8) + 32.*/

        double temperaturaCelsius = 23.4;
        double temperaturaFarenheit = (temperaturaCelsius*1.8)+32;
        System.out.println(String.format("La temperatura en Celsius es de %.2f;" +
                " lo que en Farenheit se traduce a %.2f", temperaturaCelsius,
                temperaturaFarenheit));
        String miString = "Holas";
        if (miString.equals("My String"))
        {
            System.out.println("Hello");
        }
        else {
            System.out.println("No");
        }

    switch (miString)
    {
        case "Holas":

        {
            System.out.println("BN");
            break;
        }
        default:
            System.out.println("pAN");
    }
        String[] arr ={"String", "Queso", "rEPOllo"};
        for (String s : arr) {
            System.out.println(s + "\n");
        }
        int[] array = {3, 22, 56, 2};
        for (int j : array)
        {
            System.out.println(j);
        }
    }

}