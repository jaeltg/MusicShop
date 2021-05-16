package instruments;

import behaviours.IPlay;

public class Violin extends Instrument implements IPlay {

    private int numberOfStrings;

    public Violin(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfStrings){
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String play() {
        return "Zing Ziiiing Zinggggg";
    }
}
