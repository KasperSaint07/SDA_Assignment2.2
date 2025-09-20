package TransportFactory;

public class USAShip implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by USA ship");
    }
}
