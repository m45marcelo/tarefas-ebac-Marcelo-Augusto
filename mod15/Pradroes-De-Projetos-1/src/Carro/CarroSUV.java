package Carro;

public class CarroSUV implements Carro {
    protected String marca;
    protected String modelo;
    protected double preco;

    public CarroSUV(){
        this.marca = "Honda";
        this.modelo = "CR-V";
        this.preco = 352900;
    }
    @Override
    public void exibirInformacoes() {
        System.out.println(
                "Carro da Marca " + marca + " modelo " + modelo + "\n" +
                "do tipo SUV " + "com preço de " + "R$" + String.format("%.2f", preco)
        );
    }
}
