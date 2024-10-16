// Car.java
 class Car {
 // Attributes (fields)
 private String color;
 private String model;
 private int year;

 // Default Constructor
 public Car() {
     this.color = "Unknown"; // Default value
     this.model = "Unknown"; // Default value
     this.year = 0;          // Default value
 }

 // Parameterized Constructor
 public Car(String color, String model, int year) {
     this.color = color;
     this.model = model;
     this.year = year;
 }

 // Method to display car details
 public void displayDetails() {
     System.out.println("Car Model: " + model);
     System.out.println("Car Color: " + color);
     System.out.println("Manufacture Year: " + year);
     System.out.println(); // Print a blank line for better readability
 }
}

// Main.java
public class index {
 public static void main(String[] args) {
     // Creating an object using the default constructor
     Car defaultCar = new Car();
     System.out.println("Details of Default Car:");
     defaultCar.displayDetails();

     // Creating an object using the parameterized constructor
     Car parameterizedCar = new Car("Red", "Toyota Camry", 2020);
     System.out.println("Details of Parameterized Car:");
     parameterizedCar.displayDetails();
 }
}

