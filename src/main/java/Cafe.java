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

    public boolean sellProducts(){
        if(countNumberOfProducts() > 0){
            return true;
        } return false;
    }
}
