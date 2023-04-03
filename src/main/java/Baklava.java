public class Baklava extends Pastry {

    int amountOfSyrup;
    public Baklava(String name, double price, int numberOfEggs, int water, boolean filoPastryNeeded, int input){
        super(name, price, numberOfEggs, water, filoPastryNeeded);
        this.amountOfSyrup = input;
    }

}
