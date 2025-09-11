public class Main {
    public static void main(String[] args) {
        if (Carro.class.isAnnotationPresent(Tabela.class)) {
            Tabela tabela = Carro.class.getAnnotation(Tabela.class);
            System.out.println("Nome da tabela: " + tabela.value());
        }
    }
}
