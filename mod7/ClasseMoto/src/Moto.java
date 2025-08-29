// Importa a classe NumberFormat para formatação de números, como valores monetários
import java.text.NumberFormat;
// Importa a classe Locale para definir configurações regionais, como idioma e país
import java.util.Locale;

// Declaração da classe Moto
public class Moto {
    // Atributos privados da classe Moto
    private String marca;
    private String modelo;
    private int anoLancamento;
    private double valor;

    // Construtor da classe Moto, inicializa os atributos com os valores fornecidos
    public Moto(String marca, String modelo, int anoLancamento, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoLancamento = anoLancamento;
        this.valor = valor;
    }

    // Método para exibir os detalhes da moto
    public void exibirDetalhesDaMoto() {
        // Cria um formatador de moeda para o formato brasileiro (R$)
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        // Imprime os detalhes da moto formatados
        System.out.println(
                "Marca da Moto: " + this.marca + "\n" + // Exibe a marca
                        "Modelo da Moto: " + this.modelo + "\n" + // Exibe o modelo
                        "Ano de Lançamento: " + this.anoLancamento + "\n" + // Exibe o ano
                        "Valor: " + "R$" + formatadorMoeda.format(this.valor) // Exibe o valor formatado
        );
    }

    public static void main(String[] args) {
        // Cria uma instância da classe Moto com valores específicos
        Moto moto1 = new Moto("Honda", "CG 160", 2025, 20850);
        // Chama o método para exibir os detalhes da moto criada
        moto1.exibirDetalhesDaMoto();
    }
}