public class Car extends Vehicle {

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public Car(String name, int wheels) {
        super(name, wheels);
    }
}

