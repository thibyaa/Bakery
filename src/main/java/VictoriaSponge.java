public class VictoriaSponge extends Cake {

    String typeOfJam;
    public VictoriaSponge(String name, double price, int numberOfEggs, int numberOfLayers, String baseFlavour, String shape, String typeOfJam){
        super(name, price, numberOfEggs, numberOfLayers, baseFlavour, shape);
        this.typeOfJam = typeOfJam;
    }
}
