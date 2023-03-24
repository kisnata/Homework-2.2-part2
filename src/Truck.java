public class Truck extends Car {


    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    public Truck(String name, int wheels) {
        super(name, wheels);
    }
}

