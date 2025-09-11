public abstract class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public abstract void exibirInfo();
}
