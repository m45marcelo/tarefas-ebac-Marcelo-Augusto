
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class FiltroMulheresTest {
    @Test
    public void deveConterSomenteMulheres() {
        // Dado (Given)
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Maria", "F"),
                new Pessoa("Ana", "F"),
                new Pessoa("João", "M"),
                new Pessoa("Carlos", "M")
        );
        FiltroMulheres filtro = new FiltroMulheres();

        List<Pessoa> apenasMulheres = filtro.filtrarMulheres(pessoas);

        Assert.assertFalse( "Lista de mulheres não pode ser vazia",apenasMulheres.isEmpty());

        Assert.assertTrue(
                "Todos os elementos devem ser do sexo feminino",
                apenasMulheres.stream().allMatch(p -> p.getSexo().equalsIgnoreCase("F"))
        );
    }
}
