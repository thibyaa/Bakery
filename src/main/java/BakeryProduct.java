public abstract class BakeryProduct {

    String name;
    double price;


    public BakeryProduct(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String bake(){
        return "Bake for 30 minutes";
    }

    public String bake(int time){
        return "Bake for " + time + " minutes" ;
    }
}

//things to add:
//interface using implements
