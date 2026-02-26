
package exerciciopessoa;


public class ExemploPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa UmPessoa = new Pessoa();
        
        UmPessoa.nome = "PEDRO";
        UmPessoa.pais = "BRASIL";
        UmPessoa.sexo = "MASCULINO";
        
        UmPessoa.Caracteristicas();
        UmPessoa.pessoaAnda();
        UmPessoa.pessoaBrinca();
        UmPessoa.pessoaCorre();
        UmPessoa.pessoaEstuda();
        UmPessoa.pessoaFala();
    }
    
}
