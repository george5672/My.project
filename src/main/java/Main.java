
interface Transport {
    void move();
}

class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Автомобіль їде дорогою ");
    }
}

class Plane implements Transport {
    @Override
    public void move() {
        System.out.println("Літак летить у небі ");
    }
}
abstract class TransportFactory {
    public abstract Transport createTransport();
}


class CarFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Car();
    }
}

class PlaneFactory extends TransportFactory {
    @Override
    public Transport createTransport() {
        return new Plane();
    }
}
class Client {
    public void run() {

        TransportFactory carFactory = new CarFactory();
        Transport car = carFactory.createTransport();
        TransportFactory planeFactory = new PlaneFactory();
        Transport plane = planeFactory.createTransport();
        car.move();
        plane.move();
    }
}


public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
}







