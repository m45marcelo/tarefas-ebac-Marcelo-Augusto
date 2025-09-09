package Carro;

public class SedanFactory implements CarroFactory{
    public Carro createCarro(){
        return new CarroSedan();
    }

}
