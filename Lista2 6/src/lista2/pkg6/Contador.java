
package lista2.pkg6;

public class Contador {
    int numero;

    public Contador(int numero) {
        this.numero = numero;
    }
    
    public void incrementar(){
        numero++;
    }
    public void decrementar(){
        numero--;
    }
    
    public void exibir(){
        System.out.println("=======================");
        System.out.println("Número atual: " + numero);
    }
}
