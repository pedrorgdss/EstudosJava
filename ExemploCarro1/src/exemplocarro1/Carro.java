/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplocarro1;

/**
 *
 * @author Admin
 */
public class Carro {
    String color;
    String modelo;
    String motor;
    
    //métodos
    void ligar(){
        System.out.println("ligando carro");
    }
    void desligar(){
        System.out.println("desligando carro");
    }
    void acelerar(){
        System.out.println("acelerando carro");
    }
    void brecar(){
        System.out.println("brecando carro");
    }
    void mudarMarcha(){
        System.out.println("mudando a marcha do carro");
    }
    
   void exibircaracteristicas (){
       System.out.println("a cor do carro é: " +color);
       System.out.println("o modelo do carro é: " +modelo);
       System.out.println("a modelo do carro é: " +motor);
       
        
    }
    }

