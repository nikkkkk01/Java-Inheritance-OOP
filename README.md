### 📝 README.md (Lab 3 OOP)

```markdown
Lab-3-OOP-Inheritance

A simple Java OOP project that demonstrates **inheritance** by creating a Vehicle system.  
The program simulates a transport company that manages Cars and Motorcycles, each with their own maintenance funds.  

🚀 Features
- Parent class `Vehicle` with brand, model, year, and maintenance account.
- Child classes:
  - `Car` → adds number of doors.
  - `Motorcycle` → adds sidecar option.
- Method overriding (`displayInfo()` customized per child class).
- BankAccount object linked to each vehicle for depositing funds.
- Demonstrates **inheritance, method overriding, and composition**.

📂 Project Structure
```

myPackage/
│── Main.java         # Entry point, creates Car and Motorcycle objects
│── Vehicle.java      # Parent class with common attributes and methods
│── Car.java          # Child class with extra attribute (number of doors)
│── Motorcycle.java   # Child class with extra attribute (sidecar)
│── BankAccount.java  # Handles maintenance funds for vehicles

````

🛠️ How to Run
Clone the repository:
```bash
git clone https://github.com/<your-github-username>/Lab3OOPInheritance.git
````

Open the project in your IDE (NetBeans, IntelliJ, Eclipse, or VS Code).
Compile and run `Main.java`.

📖 Concepts Used

* **Inheritance** (`extends` keyword in Car and Motorcycle)
* **Method Overriding** (`displayInfo()` redefined in child classes)
* **Composition** (Vehicle has a BankAccount object)
* **Encapsulation** (private fields with controlled access)

✨ Future Improvements

* Add more vehicle types (Bus, Truck, etc.)
* Implement withdrawal and transaction history in BankAccount.
* Save vehicle information into a file or database.
