package myPackage;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int year, BankAccount account, int numberOfDoors) {
        super(brand, model, year, account); // call Vehicle constructor
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // show Vehicle info
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}

