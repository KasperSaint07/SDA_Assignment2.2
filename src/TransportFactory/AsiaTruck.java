package TransportFactory;

public class AsiaTruck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by Asian Truck");
    }
}
