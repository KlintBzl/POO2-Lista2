
package lista2.pkg3;

import java.util.Scanner;

public class Carro {
    Scanner scannerA = new Scanner(System.in);
    Scanner scannerD = new Scanner(System.in);
    
    String marca, modelo;
    int ano;
    double velocidade = 0;
    String status;
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        
    }
    
    public void exibir(){
        if(velocidade > 0){
            status = "Em movimento...";
    }else{
            status = "Parado";
        }
        System.out.println("==========================");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade atual: " + velocidade);
        System.out.println("Status: " + status);
        System.out.println("==========================");
    }
    
    public void acelerar(){
        System.out.println("Deseja acelerar o carro? (sim/nao)");
        String SN = scannerA.nextLine();
        SN = SN.toLowerCase();
        if(SN.equals("sim")){
            System.out.println("");
            System.out.println("Quanto deseja acelerar?");
        for(int j = 1; j > 0; j++){
            
            int i = scannerA.nextInt();
            velocidade += i;
            System.out.println("");
            System.out.println("Velocidade acelerada: " + velocidade);
            System.out.println("");
            if(i == 0){
                System.out.println("Parando de acelerar..!");
                break;
            }else if(i > 0){
                System.out.println("Quer acelerar mais? Digite o quanto mais:");
                System.out.println("*para parar de acelerar digite 0*");
            }
        }
        }else{
            System.out.println("");
            System.out.println("Então por que ativou esse método??? Affs :/");
        }
        
    }
    
    public void desacelerar(){
        System.out.println("Deseja desacelerar o carro? (sim/nao)");
        String SN = scannerD.nextLine();
        SN = SN.toLowerCase();
        if(SN.equals("sim")){
            System.out.println("");
            System.out.println("Quanto deseja desacelerar?");
        for(int j = 1; j > 0; j++){
            int i = scannerD.nextInt();
            if(i == 0){
                System.out.println("Parando de desacelerar..!");
                break;
            }else if(i < velocidade){
                System.out.println("Quer acelerar mais? Digite o quanto mais:");
                System.out.println("*para parar de desacelerar digite 0*");
                velocidade -= i;
                System.out.println("");
                System.out.println("Velocidade desacelerada: " + velocidade);
                System.out.println("");
            }else if(velocidade == 0){
                velocidade = 0;
                System.out.println("Ops parece que o carro já está parado");
                break;
            }else if(i > velocidade || i == velocidade){
                velocidade = 0;
                System.out.println("Opa! O carro parou. Bom, acontece se você desacelerar até parar.");
                break;
            }
            
        }
        }else{
            System.out.println("");
            System.out.println("Então por que ativou esse método??? Affs :/");
        }
    }
}
