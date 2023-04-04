import java.util.ArrayList;

public class Cafe {

    private String name;
    private double till;

    private ArrayList<BakeryProduct> bakedGoods;

    public Cafe(String name){
        this.name = name;
        this.till = 0;
        this.bakedGoods = new ArrayList<>();
    }

    public void addToCollection(BakeryProduct bakedGoods){
        this.bakedGoods.add(bakedGoods);
    }

    public int countNumberOfProducts(){
        return bakedGoods.size();
    }

    public boolean sellProducts(BakeryProduct bakedGoods){
        if(countNumberOfProducts() > 0){
            this.bakedGoods.remove(bakedGoods);
            setTill(bakedGoods.price);
            return true;
        } return false;
    }

    public void setTill(double income){
        this.till += income;
    }

    public double getTill() {
        return till;
    }
}
