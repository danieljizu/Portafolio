package test;

import static com.mycompany.calculadora.Operaciones.Restar;
import static com.mycompany.calculadora.Operaciones.Sumar;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        int resultado = 0;
        int valor1, valor2 = 0;
        String operacion = "";

        Scanner con = new Scanner(System.in);

        System.out.println("Ingrese el indicador de operacion a realizar: ");
        System.out.println("sumar" + "\n" + "restar");
        operacion = con.nextLine();
        System.out.println("Ingrese los valores a operar: ");
        valor1 = con.nextInt();
        valor2 = con.nextInt();

        if (operacion.equals("sumar")) {
            resultado = Sumar(valor1, valor2);
            System.out.println("resultado = " + resultado);
        } else {
            resultado = Restar(valor1, valor2);
            System.out.println("resultado = " + resultado);
        }
    }

}
