/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplo2;

/**
 *
 * @author Pedro
 */
import javax.swing.JOptionPane;

public class Exemplo2 {

    public static void main(String[] args) {
        int t;
        String p;
        //aqui nesta linha era para ter o método digite, mas como no exemplo 1 ele foi redundante e apos analisasr o codigo nos slides, vi que cairia no mesmo caso do exemplo1: mais uma linha de código para mostrar a mesma coisa
        p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
        t = tamanho(p);
        JOptionPane.showMessageDialog(null, p + " possui " + t + " caracteres");

    }

    static int tamanho(String x) {

        return x.length();

    }
}
