package shop;

import behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop(){
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        stock.add(item);
    }

    public void removeItem(ISell item){
        stock.remove(stock.indexOf(item));
    }

    public double calculatePotentialProfit(){
        double total = 0;
        for (ISell shopItem : this.stock){
            total += shopItem.calculateMarkup();
        }
        return total;
    }
}
