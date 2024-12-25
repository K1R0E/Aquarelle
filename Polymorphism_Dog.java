package animall;


public class Polymorphism_Dog extends Animal {
    Dog(String name, String habitat){
        super(name, habitat);
    }

    @Override
    void sound(){
        System.out.println(getName() + " says: Woof! Woof!");
    }

}
