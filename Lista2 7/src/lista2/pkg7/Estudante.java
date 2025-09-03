
package lista2.pkg7;

import java.util.ArrayList;

public class Estudante {
    
    String nome;
    int idade, T;
    ArrayList<String> m;

    public Estudante(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.m = new ArrayList<>();
    }
    
    public void adicionarMatéria(String M){
            m.add(M);
    }
    
    public void exibir(){
        System.out.println("================");
        System.out.println("Nome do aluno:" + nome);
        System.out.println("Idade:" + idade);
        for(String m : m){
            System.out.println("Matérias: " + m);
        }
    }
}
