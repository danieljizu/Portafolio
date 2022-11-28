package test;

import static com.mycompany.calculadora.Operaciones.Sumar;
import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        System.out.println("Ingrese los valores a operar: ");
        int valor1 = con.nextInt();
        int valor2 = con.nextInt();

        int resultado = Sumar(valor1, valor2);
        System.out.println("resultado = " + resultado);
        
    }

}
