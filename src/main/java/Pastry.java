public abstract class Pastry extends BakeryProduct {

    int water;
    boolean filoPastryNeeded;
    public Pastry(String name, double price, int numberOfEggs, int water, boolean filoPastryNeeded){
        super(name, price, numberOfEggs);
        this.water = water;
        this.filoPastryNeeded = filoPastryNeeded;
    }
}
