public class PessoaFisica extends Pessoa {
    private String cpf;

    PessoaFisica(String nome, String tipo, String cpf){
        super(nome, tipo);
        this.cpf = cpf;
    }

    @Override
    public void mostrarInfoPessoa() {
        System.out.println(
                "---Informações Pessoais---" + "\n" +
                "Nome: " + getNome() + "\n" +
                "Tipo: " + "Pessoa " + getTipo() + "\n" +
                "CPF: " + this.cpf
                );
    }
}
