
package lista2.pkg4;

public class Livro {
    String titulo, autor;
    int NP, NE;
    int NI;

    public Livro(String titulo, String autor, int NP, int NE) {
        this.titulo = titulo;
        this.autor = autor;
        this.NP = NP;
        this.NE = NE;
        this.NI = NE;
        
    }
    
    public void emprestar(int q){
        if(NE > q){
            NE -= q;
            
            System.out.println("Números de livros em estoque: " + NE);
            System.out.println("Números de livros emprestados no total: " + NI);
            
        }else if(NE == 0){
            System.out.println("Infelizmente o livro '" + titulo + "' esgotou de estoque");
        }else if(NE < q){
            System.out.println("O livro '" + titulo + "' não tem em estoque a quantidade pedida");
        }
    }
    
    public int Devolver(int q){
        int NF = NE + q;
        if( NF > NI){
            System.out.println("Opa! Tem certeza que está devolvendo o número de livros correto?");
        }else if(NF <= NI){
            NE += q;
            if(q == 1){
                System.out.println("Tudo certinho, livro devolvido. Obrigado :D");
            }else{
                System.out.println("Tudo certinho, livros devolvidos. Obrigado :D");
            }
            
            
        }
        return NE;
    }
}
