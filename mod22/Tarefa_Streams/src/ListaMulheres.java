import java.util.*;
import java.util.stream.Collectors;

public class ListaMulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<>();

        System.out.println("Digite nome-sexo (F ou M), exemplo: Maria-F. Linha vazia para terminar:");
        while (true) {
            String linha = scanner.nextLine().trim();
            if (linha.isEmpty()) break;

            String[] partes = linha.split("-");
            if (partes.length != 2) {
                System.out.println("Formato inválido! Use nome-sexo (ex.: Maria-F)");
                continue;
            }

            String nome = partes[0].trim();
            String sexo = partes[1].trim().toUpperCase();

            pessoas.add(new Pessoa(nome, sexo));
        }

        List<Pessoa> mulheres = pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());

        System.out.println("\nLista de mulheres:");
        mulheres.forEach(m -> System.out.println(m.getNome()));
    }
}

class Pessoa {
    private String nome;
    private String sexo; 

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome() { return nome; }
    public String getSexo() { return sexo; }
}