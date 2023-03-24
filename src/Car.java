public class Car extends Vehicle implements ServiceStationInterface {

    public void check() {
        System.out.println("Проверяем двигатель");
    }

    public Car(String name, int wheels) {
        super(name, wheels);
    }
}

