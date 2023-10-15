public class Main {
    public static void main(String[] args) {

        Bicycle bicycle1 = new Bicycle("Adriatica");
        Bicycle bicycle2 = new Bicycle("Aspect");
        Car infiniti = new Car("Infiniti QX55");
        Car jeep = new Car("Jeep Grand Cherokee");
        Truck man = new Truck("Man F2000");
        Truck maz  = new Truck("МАЗ-5440C9", 8);

        Transport [] transports = {
                bicycle1,
                bicycle2,
                infiniti,
                jeep,
                man,
                maz
        };

        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport : transports) {
            serviceStation.check(transport);
        }
    }

}