import TransportFactory.*;
import Logisctics.*;

public class Runner {
    public static void run() {
        demoAbstractFactory();
        demoFactoryMethod();
    }

    private static void demoAbstractFactory() {
        System.out.println("Abstract Factory:");
        testFactory(new AsiaFactory());
        testFactory(new USAFactory());
    }

    private static void demoFactoryMethod() {
        System.out.println("\nFactory Method:");
        new RoadLogistic().planDelivery();
        new SeaLogistic().planDelivery();
    }

    private static void testFactory(TransportFactory factory) {
        factory.createTruck().deliver();
        factory.createShip().deliver();
    }
}
