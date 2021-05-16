package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    private Guitar guitar;
    private Piano piano;
    private Trumpet trumpet;
    private Violin violin;

    @Before
    public void setUp(){
        this.guitar = new Guitar("wood","white", InstrumentType.STRING, 100.0, 160.0, 6,false);
        this.piano = new Piano("metal", "green", InstrumentType.KEYBOARD, 200.0, 300.0, 88, false);
        this.trumpet = new Trumpet("brass", "gold", InstrumentType.BRASS, 90.0, 120.0, 3);
        this.violin = new Violin("wood", "purple", InstrumentType.STRING, 120.0, 180.0, 4);
    }

    @Test
    public void canGetMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("purple", violin.getColour());
    }

    @Test
    public void canGetType(){
        assertEquals(InstrumentType.BRASS, trumpet.getType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(200.0, piano.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(300.0, piano.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice(){
        guitar.setBuyingPrice(120.0);
        assertEquals(120.0, guitar.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        guitar.setSellingPrice(190.0);
        assertEquals(190.0, guitar.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(30.0, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void guitarCanGetNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void guitarCanCheckIfElectric(){
        assertEquals(false, guitar.isElectric());
    }

    @Test
    public void violinCanGetNumberOfStrings(){
        assertEquals(4, violin.getNumberOfStrings());
    }

    @Test
    public void trumpetCanGetNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void pianoCanGetNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void pianoCanCheckIfElectric(){
        assertEquals(false, piano.isElectric());
    }

    @Test
    public void canPlay(){
        assertEquals("Tada Ta Tada Ta Ta", trumpet.play());
        assertEquals("Twang Twang Twing Twing Twuuung", guitar.play());
        assertEquals("Tun Turuntun Tun Turun", piano.play());
        assertEquals("Zing Ziiiing Zinggggg", violin.play());
    }

}
