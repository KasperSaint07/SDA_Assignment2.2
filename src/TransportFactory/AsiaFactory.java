package TransportFactory;

public class AsiaFactory implements TransportFactory {
    @Override
    public Transport createTruck() {
        return new AsiaTruck();
    }

    @Override
    public Transport createShip() {
        return new AsiaShip();
    }
}
