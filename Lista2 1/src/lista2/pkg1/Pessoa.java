
package lista2.pkg1;

public class Pessoa {
    String nome, profissão;
    int idade;


    public Pessoa(String nome, String profissão, int idade) {
        this.nome = nome;
        this.profissão = profissão;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", profiss\u00e3o = " + profissão + ", idade = " + idade + '}';
    }
}
