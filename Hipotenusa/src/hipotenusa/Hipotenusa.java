/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenusa;

/**
 *
 * @author Pedro
 */
import java.util.Scanner;
public class Hipotenusa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double base;
       double altura;
       
        System.out.println("Digite valor da base: ");
        base = sc.nextInt();
        
        System.out.println("Digite o valor da altura: ");
        altura = sc.nextInt();
        
        Hipotenusa.hipotenusa(base, altura);
        
        //  imprimindo resultado com metodo hipotenusa
      
    }
    static void hipotenusa(double B, double a){
        double calcula = (B*B)+(a*a);
        System.out.println("O tamanho da hipotenusa é: " + calcula);
    }
    }

