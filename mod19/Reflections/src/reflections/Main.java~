package reflections;

public class Main {
    public static void main(String[] args) {


        Class<?>[] classes = { Carro.class, Moto.class };

        for (Class<?> clazz : classes) {
            
            if (clazz.isAnnotationPresent(Tabela.class)) {
                Tabela tabela = clazz.getAnnotation(Tabela.class);
                System.out.println(clazz.getSimpleName() +
                        " -> Nome da tabela: " + tabela.value());
            } else {
                System.out.println(clazz.getSimpleName() + " não possui a annotation @Tabela");
            }
        }
    }
}
