package myPackage;

public class Vehicle {
    private String brand;
    private String model;
    private int year;
    private BankAccount maintenanceAccount;

    public Vehicle(String brand, String model, int year, BankAccount account) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maintenanceAccount = account;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

   public void depositMaintenanceFund(double amount) {
    maintenanceAccount.deposit(amount);
    System.out.println("Deposited ₱" + amount + ". Current Balance: ₱" + maintenanceAccount.getBalance());
}
}

