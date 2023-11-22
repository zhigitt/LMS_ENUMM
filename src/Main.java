public class Main {
    public static void main(String[] args) {
        double distance = 100;

        double priceCar = TransportType.CAR.calculateTravelCost(distance);
        double priceBus = TransportType.BUS.calculateTravelCost(distance);
        double priceTruck = TransportType.TRUCK.calculateTravelCost(distance);

        System.out.println("Mahinanyn obshiy baasy: " + distance + "km  $" + priceCar);
        System.out.println("Bustun obshiy baasy: " + distance + "km  $" + priceBus);
        System.out.println("Traktyn obshiy baasy: " + distance + "km  $" + priceTruck);
    }
}