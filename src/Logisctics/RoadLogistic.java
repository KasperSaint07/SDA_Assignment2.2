package Logisctics;
import TransportFactory.Transport;
import TransportFactory.USATruck;
import TransportFactory.AsiaTruck;

public class RoadLogistic extends Logistics {
    @Override
    public Transport createTransport() {
        return new USATruck();
    }
}
