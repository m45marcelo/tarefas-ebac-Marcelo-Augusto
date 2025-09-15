public class Pessoa {
    private final String nome;
    private final String sexo; // "M" ou "F"

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() { return nome; }
    public String getSexo() { return sexo; }
}
