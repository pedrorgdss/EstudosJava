/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculodesconto;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class CalculoDesconto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //criando scanner
        Scanner sc = new Scanner(System.in);
        double precoSemDesconto;
        System.out.println("Digite o valor do produto: ");
        precoSemDesconto = sc.nextDouble();

        CalculoDesconto.calcularDesconto(precoSemDesconto);

    }

    static void calcularDesconto(double val1) {
        double desconto = 0.15;
        double valorAposDesconto = val1 * desconto;
        double resultadoFinal = val1 - valorAposDesconto;
        System.out.println("O valor após o desconto de 15% é: " + resultadoFinal);
    }

}
