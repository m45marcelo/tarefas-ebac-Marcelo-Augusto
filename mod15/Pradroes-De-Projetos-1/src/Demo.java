import Carro.Aplication;
import Carro.CarroFactory;
import Carro.SUVFactory;
import Carro.SedanFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Demo {
    public static void main(String[] args) {
        // Criando um SUV
        CarroFactory suvFactory = new SUVFactory();
        Aplication appSUV = new Aplication(suvFactory);
        appSUV.exibirInfrormacoes();

        System.out.println("---------------------------");

        // Criando um Sedan
        CarroFactory sedanFactory = new SedanFactory();
        Aplication appSedan = new Aplication(sedanFactory);
        appSedan.exibirInfrormacoes();
    }
}