/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exemplo1;

/**
 *
 * @author Pedro
 */
import javax.swing.JOptionPane;

public class Exemplo1 {

    public static void main(String[] args) { // criando a classe publica MAIN, aqui sera onde o código sera interpretado por meio de String args/*

        int a;
        Digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        dobro(a);
    }

    static void Digite() {
        //professor, eu tirei o JOptionPane que teria aqui pois com ele estava informaçoes redundantes(pedindo para o usuario inserir valores 2 vezes 
        //uma duvida é pq o método digite() esta aqui, sendo que mesmo sem ele o código faz oq precisa normalmente.
    }

    static void dobro(int n) {
        //operação para exibir o dobro
        int d = n * 2;
        //JOptionpane para exibir o resultado atraves de uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Dobro de " + n + " é " + d);
    }
}
