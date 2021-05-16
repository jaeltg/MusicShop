package shop;

import instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private Piano piano;
    private Trumpet trumpet;
    private Violin violin;
    private MusicItem musicItem1;
    private MusicItem musicItem2;
    private MusicItem musicItem3;

    @Before
    public void setUp(){
        this.shop = new Shop();
        this.guitar = new Guitar("wood","white", InstrumentType.STRING, 100.0, 160.0, 6,false);
        this.piano = new Piano("metal", "green", InstrumentType.KEYBOARD, 200.0, 300.0, 88, false);
        this.trumpet = new Trumpet("brass", "gold", InstrumentType.BRASS, 90.0, 120.0, 3);
        this.violin = new Violin("wood", "purple", InstrumentType.STRING, 120.0, 180.0, 4);
        this.musicItem1 = new MusicItem("Guitar Strings", 2.0, 8.0);
        this.musicItem2 = new MusicItem("Drum Sticks", 2.0, 6.0);
        this.musicItem3 = new MusicItem("Sheet Music", 5.0, 12.0);
        this.shop.addItem(guitar);
        this.shop.addItem(violin);
        this.shop.addItem(musicItem1);
        this.shop.addItem(musicItem3);
        this.shop.addItem(trumpet);
        this.shop.addItem(piano);
    }

    @Test
    public void hasStock() {
        assertEquals(6, shop.getStock().size());
    }

    @Test
    public void canAddItem() {
        shop.addItem(musicItem2);
        assertEquals(7, shop.getStock().size());
    }

    @Test
    public void canRemoveItem() {
        shop.removeItem(musicItem3);
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void canCalculateProfit(){
        assertEquals(263.0, shop.calculatePotentialProfit(), 0.01);
    }


}
