/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciopessoa;

/**
 *
 * @author Pedro Rodrigues Pimentel 2ºDs AMS
 */
public class Pessoa {

    String nome;
    String sexo;
    String pais;

    void pessoaAnda() {
        System.out.println("A pessoa esta andando");
    }

    void pessoaFala() {
        System.out.println("A pessoa esta falando");
    }

    void pessoaCorre() {
        System.out.println("A pessoa correndo");
    }

    void pessoaEstuda() {
        System.out.println("A pessoa esta estudando");
    }

    void pessoaBrinca() {
        System.out.println("A pessoa esta brincando");
    }
    void Caracteristicas(){
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("País: " + pais);
    }
    
}
