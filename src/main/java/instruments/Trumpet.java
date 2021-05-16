package instruments;

import behaviours.IPlay;

public class Trumpet extends Instrument implements IPlay {

    private int numberOfValves;

    public Trumpet(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfValves){
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Tada Ta Tada Ta Ta";
    }
}
