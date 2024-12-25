
package animall;


public class Polymorphism_Cat extends Animal {
    Cat(String name, String habitat){
        super(name, habitat);
    }

    @Override
    void sound(){
        System.out.println(getName() + " says: Meow!");
    }

}
