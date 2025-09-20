package Logisctics;
import TransportFactory.Transport;
import TransportFactory.AsiaShip;
import TransportFactory.USAShip;

public class SeaLogistic extends Logistics {
    @Override
    public Transport createTransport() {
        return new AsiaShip();
    }
}
