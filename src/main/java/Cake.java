public abstract class Cake extends BakeryProduct{

    int numberOfLayers;
    String baseFlavour;
    int numberOfEggs;
    String shape;

    public Cake(String name, double price, int numberOfEggs, int numberOfLayers, String baseFlavour, String shape){
        super(name, price);
        this.numberOfLayers = numberOfLayers;
        this.baseFlavour = baseFlavour;
        this.shape = shape;
        this.numberOfEggs = numberOfEggs;
    }

    public abstract String combineLayers();
}
