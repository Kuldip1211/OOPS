public class index {
 public static void main(String[] args) {
  // Creating objects of the Car class
  Car myCar = new Car("Red", "Toyota Camry", 2020);
  Car yourCar = new Car("Blue", "Honda Accord", 2019);

  // Using methods on the objects
  myCar.displayDetails();
  myCar.start();

  System.out.println(); // Print a blank line

  yourCar.displayDetails();
  yourCar.start();
 }
}

class Car {
 // Attributes (fields)
 private String color;
 private String model;
 private int year;

 // Constructor
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
 }

 // Method to start the car
 public void start() {
  System.out.println(model + " is starting.");
 }
}