package plant;

 class TestRose {


    void photosynthesize(){
      System.out.println("The plant photosynthesizes.");
    }

}
class FloweringPlant extends TestRose{
    void bloom() {
        System.out.println("the flowering plant blooms.");
    }
}

class Rose extends FloweringPlant {
    void fragrance(){
        System.out.println("The rose has a sweet fragrance.");
    }
}
public class Multilevel_Inheritance{
     public static void main(String[] args){
        Rose myRose = new Rose();
        myRose.photosynthesize();
        myRose.fragrance();
    }
}
