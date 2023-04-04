import Interface.IMix;

public class VictoriaSponge extends Cake implements IMix {

    String typeOfJam;
    public VictoriaSponge(String name, double price, int numberOfEggs, int numberOfLayers, String baseFlavour, String shape, String typeOfJam){
        super(name, price, numberOfEggs, numberOfLayers, baseFlavour, shape);
        this.typeOfJam = typeOfJam;
    }

    public String combineLayers(){
        return "Layers combined with " + this.typeOfJam;
    }

    public String mixIngredients(){
        return "Flour has been mixed before layering";
    }
}
