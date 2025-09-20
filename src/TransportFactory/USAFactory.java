package TransportFactory;

public class USAFactory implements TransportFactory {
    @Override
    public Transport createTruck() {
        return new USATruck();
    }

    @Override
    public Transport createShip() {
        return new USAShip();
    }
}
