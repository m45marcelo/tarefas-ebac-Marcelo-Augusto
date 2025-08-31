import java.util.*;

public class Colecoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        Map<String, List<String>> grupos = new HashMap<>();
        grupos.put("Masculino", new ArrayList<>());
        grupos.put("Feminino", new ArrayList<>());

        while (continuar){
            System.out.print("Digite um Nome:");
            String nome = scanner.nextLine().trim();

            System.out.println("---Escolha um Sexo---");
            System.out.println("1. Masculino");
            System.out.println("2. Feminino");
            System.out.print("Opção: ");

            int opcaoSexo;

            try {
                opcaoSexo = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e){
                System.out.println("Entrada inválida! digite um numero");
                scanner.nextLine();
                continue;
            }

            if(opcaoSexo < 1 || opcaoSexo > 2){
                System.out.println("Opção inválida! escolha entre 1 e 2");
                continue;
            }

            switch (opcaoSexo){
                case 1:
                    grupos.get("Masculino").add(nome);
                    System.out.println("Grupo Masculino = " + grupos.get("Masculino"));
                    break;
                case  2:
                    grupos.get("Feminino").add(nome);
                    System.out.println("Grupo Feminino = " + grupos.get("Feminino"));
                    break;
                }

            System.out.println("Deseja continuar com os registros ?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            System.out.print("Opção: ");

            int opcaoContinuar;

            try {
                opcaoContinuar = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e){
                System.out.println("Entrada inválida! digite um numero");
                scanner.nextLine();
                continue;
            }

            if(opcaoContinuar < 1 || opcaoContinuar > 2){
                System.out.println("Opção inválida! escolha entre 1 e 2");
                continue;
            }

            if(opcaoContinuar == 1){
                continue;
            }

            if(opcaoContinuar == 2){
                continuar = false;
                System.out.println("Encerrando Programa");
                break;
            }
        }

        System.out.println("\n--- Resultado Final ---");
        System.out.println("Grupo Masculino: " + (grupos.get("Masculino").isEmpty() ? "Vazio" : grupos.get("Masculino")));
        System.out.println("Grupo Feminino: " + (grupos.get("Feminino").isEmpty() ? "Vazio" : grupos.get("Feminino")));

        scanner.close();
    }
}