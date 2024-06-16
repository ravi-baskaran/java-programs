package interfaces;

public class Bike implements Petrol, Engine{
    @Override
    public void engine() {
        System.out.println("bike engine");
    }

    @Override
    public void dubai() {

    }
}
