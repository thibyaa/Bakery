public abstract class BakeryProduct {

    String name;
    double price;
    int numberOfEggs;

    public BakeryProduct(String name, double price, int numberOfEggs){
        this.name = name;
        this.price = price;
        this.numberOfEggs = numberOfEggs;
    }

    public boolean bake(){
        return true;
    }
}
