
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
            
            System.out.println("Números de livros cadastrados no total: " + NI);
            System.out.println("Numero de livros pedidos emprestados: " + q);
            System.out.println("Números de livros em estoque: " + NE);
            System.out.println("");
            
        }else if(NE == 0){
            System.out.println("Infelizmente o livro '" + titulo + "' esgotou de estoque");
            System.out.println("");
        }else if(NE < q){
            System.out.println("O livro '" + titulo + "' não tem em estoque a quantidade pedida");
            System.out.println("");
        }
    }
    
    public int Devolver(int q){
        int NF = NE + q;
        if( NF > NI){
            System.out.println("Opa! Tem certeza que está devolvendo o número de livros correto?");
            System.out.println("");
        }else if(NF <= NI){
            NE += q;
            if(q == 1){
                System.out.println("Tudo certinho, livro devolvido. Obrigado :D");
                System.out.println("");
            }else{
                System.out.println("Tudo certinho, livros devolvidos. Obrigado :D");
                System.out.println("");
            }
            
            
        }
        return NE;
    }
}
