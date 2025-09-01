abstract class Pessoa {
    private String nome;
    private String tipo;

    Pessoa(String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public abstract void mostrarInfoPessoa();
}