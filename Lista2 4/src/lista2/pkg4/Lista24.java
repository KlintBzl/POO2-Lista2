
package lista2.pkg4;

public class Lista24 {

    public static void main(String[] args) {
        Livro l1 = new Livro("Jurassick Park", "Michael Crichton", 300, 60);
        l1.emprestar(45);
        l1.emprestar(450);
        l1.Devolver(20);
        l1.Devolver(200);
    }
    
}
