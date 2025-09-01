public class Programa {
    public static void main(String[] arg){
        PessoaFisica pessoaFisica1 = new PessoaFisica("Marcelo Sousa", "Física", "000.989.899-98");
        pessoaFisica1.mostrarInfoPessoa();

        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Augusto Reis", "Jurídica", "00.623.904/0001-73");
        pessoaJuridica1.mostrarInfoPessoa();
    }
}
