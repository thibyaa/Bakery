public class ChocolateCake extends Cake {

    int cocoaPowder;
    public ChocolateCake(String name, double price, int numberOfEggs, int numberOfLayers, String baseFlavour, String shape, int cocoaPowder){
        super(name, price, numberOfEggs, numberOfLayers, baseFlavour, shape);
        this.cocoaPowder = cocoaPowder;
    }

    public String addChocolateChips(){
        return "Yay, diabetes";
    }
}
