package TransportFactory;

public class USATruck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by USA truck");
    }
}
