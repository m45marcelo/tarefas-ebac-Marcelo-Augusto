public class PessoaJuridica extends Pessoa {
    private String cnpj;

    PessoaJuridica(String nome, String tipo, String cnpj){
        super(nome, tipo);
        this.cnpj = cnpj;
    }

    @Override
    public void mostrarInfoPessoa() {
        System.out.println(
                "---Informações Pessoais---" + "\n" +
                        "Nome: " + getNome() + "\n" +
                        "Tipo: " + "Pessoa " + getTipo() + "\n" +
                        "CNPJ: " + this.cnpj
        );
    }
}
