public abstract class Vehicle {
    public String name;
    public int wheels;

    public Vehicle(String name, int wheels) {
        this.name = name;
        this.wheels = wheels;
    }
    public String getModelName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
