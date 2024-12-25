package animall;


public class Polymorphism_Output {
    public static void main(String[] args){
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("Buddy", "House");
        animals[1] = new Cat("Whiskers", "Apartment");

        for(Animal animal : animals){
            animal.sound();
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println();
        }
    }

}
