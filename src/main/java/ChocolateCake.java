import Interface.IMix;

public class ChocolateCake extends Cake implements IMix {

    int cocoaPowder;
    public ChocolateCake(String name, double price, int numberOfEggs, int numberOfLayers, String baseFlavour, String shape, int cocoaPowder){
        super(name, price, numberOfEggs, numberOfLayers, baseFlavour, shape);
        this.cocoaPowder = cocoaPowder;
    }

    public String addChocolateChips(){
        return "Yay, diabetes";
    }

    public String combineLayers(){
        return "Layers combined with Chocolate ButterCream";
    }

    public String mixIngredients(){
        return this.cocoaPowder + " cups of Cocoa powder was mixed with flour";
    }
}
