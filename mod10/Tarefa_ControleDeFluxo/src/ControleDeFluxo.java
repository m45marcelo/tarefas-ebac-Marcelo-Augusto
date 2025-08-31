public class ControleDeFluxo {
    public static void main(String[] args) {
      double nota1 = 7.0;
      double nota2 = 5.5;
      double nota3 = 8.0;
      double nota4 = 7.5;

      double mediaNotas = (nota1 + nota2 + nota3 + nota4) / 4;

      if(mediaNotas >=7){
          System.out.println("Media das notas do Aluno = " + mediaNotas + "\n" + "Resultado = APROVADO");
      }else if(mediaNotas >=5 && mediaNotas < 7){
          System.out.println("Media das notas do Aluno = " + mediaNotas + "\n" + "Resultado = RECUPERAÇÃO");
      }else {
          System.out.println("Media das notas do Aluno = " + mediaNotas + "\n" + "Resultado = REPROVADO");
      }
    }
}