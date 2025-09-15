import java.util.List;
import java.util.stream.Collectors;

public class FiltroMulheres {
    public List<Pessoa> filtrarMulheres(List<Pessoa> pessoas) {
        return pessoas.stream()
                .filter(p -> p.getSexo().equalsIgnoreCase("F"))
                .collect(Collectors.toList());
    }
}
