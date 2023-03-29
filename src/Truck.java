public class Truck extends Vehicle {


    public void check() {
        System.out.println("Проверяем двигатель");
        System.out.println("Проверяем прицеп");
    }

    public Truck(String name, int wheels) {
        super(name, wheels);
    }
}

