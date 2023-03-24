public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.modelName);
        for (int i = 0; i < vehicle.wheelsCount; i++) {
            vehicle.updateTyre();

        }
    }
}

