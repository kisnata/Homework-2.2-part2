public class Car extends Vehicle implements ServiceStationInterface {

    public Car(String name, int wheels) {
        super(name, wheels);
    }
    public void check() {
        System.out.println("Проверяем двигатель");
    }


}

