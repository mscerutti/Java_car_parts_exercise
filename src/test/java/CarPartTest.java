import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by localadmin on 1/20/17.
 */
public class CarPartTest {
    CarPart carPart;

    String manufacturer = "Nissan Automotives";
    String partNumber = "123456789";
    String description = "lorem ipsum lorem has a ipsum of upsum amounts";

    @Before
    public void setUp() throws Exception {
        carPart = new CarPart(manufacturer, partNumber, description);
    }
    @Test
    public void  engineComponents(){
        assertEquals("Nissan Automotives", carPart.manufacturer);
        assertEquals("123456789", carPart.partNumber);
        assertEquals("lorem ipsum lorem has a ipsum of upsum amounts", carPart.description);
    }
    @Test
    public void fullDescription() throws IllegalAccessException{

        assertEquals("manufacturer: Nissan Automotives, partNumber: 123456789, description: lorem ipsum lorem has a ipsum of upsum amounts", carPart.fullDescription());
    }

}