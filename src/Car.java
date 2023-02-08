import java.io.FileWriter;
import java.io.IOException;

public class Car implements AutoCloseable {
    public  void close() {
        System.out.println("Машина закрывается");

    }
}
