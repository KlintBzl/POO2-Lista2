
package lista2.pkg2;

public class ContaBancária {
    String Titular;
    private double Saldo;
    private int NC;

    public ContaBancária(String Titular, double Saldo, int NC) {
        this.Titular = Titular;
        this.Saldo = Saldo;
        this.NC = NC;
    }

    public String getTitular() {
        return Titular;
    }
    public void setTitular(String Titular) {
        this.Titular = Titular;
    }
    public double getSaldo() {
        return Saldo;
    }
    public int getNC() {
        return NC;
    }
    
    public double Sacar(double VS){
        if(VS > 0){
            Saldo -= VS;
        }else{
            System.out.println("-------------------");
            System.out.println("SALDO INSUFICIENTE!");
            System.out.println("-------------------");
        }
        return Saldo;
       
    }
    
    public double Depositar(double VD){
        if(VD > 0){
            Saldo += VD;
        }else{
            System.out.println("--------------------------------");
            System.out.println("POR FAVOR INSIRA UM VALOR VÁLIDO");
            System.out.println("--------------------------------");
        }
        return Saldo;
    }
    
    public void Exibir(){
        System.out.println("=================================================");
        System.out.println("Titular: " + Titular);
        System.out.println("Saldo atual: " + Saldo);
        System.out.println("Número da conta: " + NC);
        System.out.println("=================================================");
    }
}

