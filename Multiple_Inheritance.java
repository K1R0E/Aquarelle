package plants;


interface Flower {
    void bloom();
}

interface Tree {
    void grow();
}

class FloweringTree implements Flower, Tree {

    public void bloom(){
        System.out.println("The flower tree blooms.");
    }

    public void grow(){
        System.out.println("The flowering tree grows.");
    }
}
    public class Plants {
public static void main(String[] args) {
    FloweringTree myTree = new FloweringTree();
    myTree.bloom();
    myTree.grow();
  }
}
