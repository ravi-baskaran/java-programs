package interfaces;
@FunctionalInterface
public interface Petrol {
    void dubai();

    default void print1(){
        System.out.println("some default");
    }

}
