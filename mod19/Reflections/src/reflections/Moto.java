package reflections;

@Tabela("motos")
public class Moto {
    private String marca;
    private String cilindrada;

    public Moto(String marca, String cilindrada) {
        this.marca = marca;
        this.cilindrada = cilindrada;
    }
}
