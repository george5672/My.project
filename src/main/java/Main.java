-
interface Transport {
    void move();
}

class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Машина їде дорогою ");
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

-
interface Transport {
    void move();
}

class Car implements Transport {
    @Override
    public void move() {
        System.out.println("Машина їде дорогою ");
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
        TransportFactory planeFactory = new PlaneFactory();


        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();


        System.out.println("--- Перевірка створення та роботи об'єктів ---");
        System.out.println("Чи створено car за допомогою CarFactory? " + (car instanceof Car));
        System.out.println("Чи створено plane за допомогою PlaneFactory? " + (plane instanceof Plane));

        System.out.println("\n--- Виклик методів руху ---");
        car.move();
        plane.move();
    }
}


public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }
