import java.sql.SQLOutput;

public class Bicycle extends Vehicle {
public Bicycle(String name, int wheels) {
    super(name, wheels);
}
public void updateTyre(){
    System.out.println("Меняем покрышку у велосипеда");
}
}


