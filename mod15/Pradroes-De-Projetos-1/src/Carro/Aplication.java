package Carro;

public class Aplication {
    private Carro carro;

    public Aplication(CarroFactory factory){
        carro = factory.createCarro();
    }

    public void exibirInfrormacoes(){
        carro.exibirInformacoes();
    }
}
