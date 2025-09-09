package Carro;

public class CarroSedan implements Carro {
    protected String marca;
    protected String modelo;
    protected double preco;

    public CarroSedan(){
        this.marca = "Fiat";
        this.modelo = "Siena";
        this.preco = 60000;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println(
                "Carro da Marca " + marca + " modelo " + modelo + "\n" +
                "do tipo SUV " + "com preço de " + "R$" + String.format("%.2f", preco)
        );
    }
}
