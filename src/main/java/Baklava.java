import Interface.IMix;

public class Baklava extends Pastry implements IMix {

    int amountOfSyrup;
    public Baklava(String name, double price, int water, boolean filoPastryNeeded, int input){
        super(name, price, water, filoPastryNeeded);
        this.amountOfSyrup = input;
    }

    public String mixIngredients(){
        return "Flour has been mixed";
    }

}
