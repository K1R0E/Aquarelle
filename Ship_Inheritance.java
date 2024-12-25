package Ship;



class Ship {
   String name;
   double speed;

  // Constructor
   public Ship(String name, double speed) {
     this.name = name;
     this.speed = speed;
}

// Method to display ship details
   public void displayDetails() {
     System.out.println("Ship Name: " + name);
     System.out.println("Speed: " + speed + " knots");
  }
}

// Subclass
   class CargoShip extends Ship {
     double cargoCapacity;

// Constructor
   public CargoShip(String name, double speed, double cargoCapacity) {
     super(name, speed); // Call the constructor of the superclass
     this.cargoCapacity = cargoCapacity;
 }

// Method to display cargo ship details
   public void displayCargoDetails() {
     displayDetails(); // Call the method from the superclass
     System.out.println("Cargo Capacity: " + cargoCapacity + " tons");
  }
}
public class Ship_Inheritance {
   public static void main(String[] args) {
// Create an instance of CargoShip
     CargoShip cs = new CargoShip("BreakAway" , 25.5, 50000);
     cs.displayCargoDetails();
  }
}
