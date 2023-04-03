public abstract class Cake extends BakeryProduct{

    int numberOfLayers;
    String baseFlavour;
    String shape;

    public Cake(String name, double price, int numberOfEggs, int numberOfLayers, String baseFlavour, String shape){
        super(name, price, numberOfEggs);
        this.numberOfLayers = numberOfLayers;
        this.baseFlavour = baseFlavour;
        this.shape = shape;
    }
}
