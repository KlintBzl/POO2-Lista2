
package lista2.pkg5;

public class Retangulo {
    
    double altura, largura, Resultado;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }
    
    private double calcularArea(){
        Resultado = altura * largura;
        return Resultado;
    }
    
    public double calcularPerimetro(){
        Resultado = altura + altura + largura + largura;
        return Resultado;
    }
    
    public void ExibirResultado(){
        System.out.println("==================");
        System.out.println("Altura: " + altura);
        System.out.println("Largura: " + largura);
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
    }
}
