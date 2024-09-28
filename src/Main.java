public class Main {
    public static void main(String[] args) {
        // Vehicle with all fields
        Vehicle vehicle1 = new Vehicle.VehicleBuilder()
                .withEngineType("1.8 115 p.h. 16 valve")
                .withTransmission("Automatic")
                .withColor("Gray")
                .withSunroof(false)
                .withNumberOfDoors(5)
                .build();

        System.out.println("Vehicle 1: " + vehicle1);

        // Vehicle without optional fields
        Vehicle vehicle2 = new Vehicle.VehicleBuilder()
                .withEngineType("Electric")
                .withTransmission("Manual")
                .withColor("White")
                .build();

        System.out.println("Vehicle 2: " + vehicle2);
    }
}