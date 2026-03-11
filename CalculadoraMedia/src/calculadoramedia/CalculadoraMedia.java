/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoramedia;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class CalculadoraMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3;

        System.out.println("Digite sua primeira nota: ");
        num1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        num2 = sc.nextDouble();
        System.out.println("Digite sua terceira nota: ");
        num3 = sc.nextDouble();

        CalculadoraMedia.calcularMedia(num1, num2, num3);

    }

    static void calcularMedia(double val1, double val2, double val3) {
        double media = (val1 + val2 + val3) / 3;
        System.out.println("sua média é: " + media);

    }
}
