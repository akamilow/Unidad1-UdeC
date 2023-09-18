package Complementarios;

/*
Desea Calcular el Perímetro de polígono Regular de 6 lados.
Formula:
    P = 6 * lado
*/
import java.util.Scanner;

public class EjercicioC1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese longitud de un lado");
        int lado = sc.nextInt();
        int perimetro = 6 * lado;
        System.out.println("Es perimetor del poligono es: " + perimetro);
        sc.close();
    }
    
}