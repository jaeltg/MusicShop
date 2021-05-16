package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicItemTest {

    private MusicItem musicItem1;
    private MusicItem musicItem2;
    private MusicItem musicItem3;

    @Before
    public void setUp(){
        this.musicItem1 = new MusicItem("Guitar Strings", 2.0, 8.0);
        this.musicItem2 = new MusicItem("Drum Sticks", 2.0, 6.0);
        this.musicItem3 = new MusicItem("Sheet Music", 5.0, 12.0);
    }

    @Test
    public void canGetType(){
        assertEquals("Drum Sticks", musicItem2.getType());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(5.0, musicItem3.getBuyingPrice(), 0.01);
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(12.0, musicItem3.getSellingPrice(), 0.01);
    }

    @Test
    public void canSetBuyingPrice(){
        musicItem1.setBuyingPrice(3.0);
        assertEquals(3.0, musicItem1.getBuyingPrice(), 0.01);
    }

    @Test
    public void canSetSellingPrice(){
        musicItem1.setSellingPrice(10.0);
        assertEquals(10.0, musicItem1.getSellingPrice(), 0.01);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(6.0, musicItem1.calculateMarkup(), 0.01);
    }
}
