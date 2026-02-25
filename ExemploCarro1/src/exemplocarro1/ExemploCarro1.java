/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplocarro1;

/**
 *
 * @author Admin
 */
public class ExemploCarro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro umCarro = new Carro();
        
        
        umCarro.modelo = "civic";
        umCarro.color = "Vermelho";
        umCarro.motor = "2.0 biturbo";
        
        umCarro.ligar();
        umCarro.acelerar();
        umCarro.desligar();
        umCarro.mudarMarcha();
        umCarro.brecar();
        umCarro.exibircaracteristicas();
        
                
    }
    
}
