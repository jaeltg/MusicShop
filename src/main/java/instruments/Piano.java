package instruments;

import behaviours.IPlay;

public class Piano extends Instrument implements IPlay {

    private int numberOfKeys;
    private boolean electric;

    public Piano(String material, String colour, InstrumentType type, double buyingPrice, double sellingPrice, int numberOfKeys, boolean electric){
        super(material, colour, type, buyingPrice, sellingPrice);
        this.numberOfKeys = numberOfKeys;
        this.electric = electric;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public boolean isElectric() {
        return electric;
    }

    public String play() {
        return "Tun Turuntun Tun Turun";
    }
}
