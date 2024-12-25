class Plant {
    void grow() {
        System.out.println("The plant grows.");
    }
}

class FloweringPlant extends Plant {
    void bloom() {
        System.out.println("The flowering plant blooms.");
    }
}

class NonFloweringPlant extends Plant {
    void reproduce() {
        System.out.println("The non-flowering plant reproduces.");
    }
}

class Rose extends FloweringPlant {
    void fragrance() {
        System.out.println("The rose has a sweet fragrance.");
    }
}

class Moss extends NonFloweringPlant {
    void absorbMoisture() {
        System.out.println("The moss absorbs moisture.");
    }
}

public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Rose myRose = new Rose();
        myRose.grow();
        myRose.bloom();
        myRose.fragrance();

        Moss myMoss = new Moss();
        myMoss.grow();
        myMoss.reproduce();
        myMoss.absorbMoisture();
    }
}
