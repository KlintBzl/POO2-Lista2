
package lista2.pkg2;

public class Lista22 {

    public static void main(String[] args) {
        ContaBancária CB1 = new ContaBancária("Klint BBL", 1500.0, 1);
        System.out.println("Saldo atual: " + CB1.getSaldo());
        System.out.println("Saldo atual: " + CB1.Depositar(0));
        CB1.Exibir();
        System.out.println("Saldo atual: " + CB1.Sacar(700));
        System.out.println("Saldo atual: " + CB1.Depositar(700));
        System.out.println("Saldo atual: " + CB1.Sacar(0));
        System.out.println("Saldo atual: " + CB1.Sacar(1000));
        CB1.Exibir();
        
    }
    
}
