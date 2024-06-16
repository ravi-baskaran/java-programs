package interfaces;
@FunctionalInterface
public interface Engine {
    void engine();

    default void print(){
        System.out.println("some default");
    }
}
