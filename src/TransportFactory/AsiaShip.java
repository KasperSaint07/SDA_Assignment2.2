package TransportFactory;

public class AsiaShip implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by Asian ship");
    }
}
