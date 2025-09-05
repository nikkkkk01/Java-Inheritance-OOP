package myPackage;


    public class Main {
    public static void main(String[] args) {
        BankAccount carAccount = new BankAccount(100000);
        Car car = new Car("Toyota", "Vios", 2022, carAccount, 4);

        BankAccount motorcycleAccount = new BankAccount(20000);
        Motorcycle motorcycle = new Motorcycle("Honda", "Click", 2023, motorcycleAccount, false);

        System.out.println("=== Car Info ===");
        car.displayInfo();
        car.depositMaintenanceFund(15000);

        System.out.println("\n=== Motorcycle Info ===");
        motorcycle.displayInfo();
        motorcycle.depositMaintenanceFund(1500);
    }
}
