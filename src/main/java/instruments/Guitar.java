package instruments;

import behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;
    private boolean electric;

    public Guitar(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfStrings, boolean electric){
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfStrings = numberOfStrings;
        this.electric = electric;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public boolean isElectric() {
        return electric;
    }

    public String play() {
        return "Twang Twang Twing Twing Twuuung";
    }
}
