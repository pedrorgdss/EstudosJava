/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tempo;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Tempo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double minutos;
        System.out.println("Digite seu tempo em minutos: ");
        minutos = sc.nextDouble();
        
        Tempo.converterParaHoras(minutos);
        
        
    }
    static void converterParaHoras(double val1){
        double Converter = val1/60;
        System.out.println(val1 + " minutos sendo convertido para horas é igual a: " +Converter+ " hora/s");
        
    }
    }

