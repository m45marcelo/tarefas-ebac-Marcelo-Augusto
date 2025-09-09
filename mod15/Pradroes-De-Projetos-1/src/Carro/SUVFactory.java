package Carro;

public class SUVFactory implements CarroFactory{
    @Override
    public Carro createCarro() {
        return new CarroSUV();
    }
}
