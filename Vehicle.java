public class Vehicle {
    private String serialNumber;
    private String name;
    private String model;
    private int year;
    private String manufacturer;
    private double baseCost;

    Vehicle(String serialNumber, String name, String model, int year, String manufacturer, double baseCost) {
        this.serialNumber = serialNumber;
        this.name = name;
        this.model = model;
        this.year = year;
        this.manufacturer = manufacturer;
        this.baseCost = baseCost;
    }

    public void printVehicle() {
        System.out.println("Serial Number: " + serialNumber + "\n" + "Name: " + name + "\n" + "Model: " + model + "\n" + "Year: " + year + "\n" + "Manufacturer: " + manufacturer + "\n" + "Base Cost: " + baseCost);
    }   
}