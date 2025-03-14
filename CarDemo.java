class Car {
    // Attributes (Data Fields)
    String make;    // The make of the car
    String model;   // The model of the car
    int year;       // The year of the car

    // Method to display the car's information
    public void displayInfo() {
        System.out.println("Car: " + year + " " + make + " " + model);
    }
}

// CarDemo.java
// This is the main class where the program starts execution.
public class CarDemo {
    public static void main(String[] args) {
        // Step 5: Create a Car object
        Car myCar = new Car();

        // Step 6: Assign values to the attributes of myCar
        myCar.make = "Toyota";
        myCar.model = "Corolla";
        myCar.year = 2020;

        // Step 7: Call the displayInfo method on myCar
        myCar.displayInfo();
    }
}
	