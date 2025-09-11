public class Honda extends Carro {
    public Honda(String modelo) {
        super("Honda", modelo);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}
