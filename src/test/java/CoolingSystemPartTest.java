import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by localadmin on 1/20/17.
 */
public class CoolingSystemPartTest {
    CoolingSystemPart coolingSystemPart;

    String manufacturer = "Nissan Automotives";
    String partNumber = "123456789";
    String description = "lorem ipsum lorem has a ipsum of upsum amounts";

    @Before
    public void setUp(){
        coolingSystemPart = new CoolingSystemPart(manufacturer, partNumber, description);
    }

    @Test
    public void coolingSystemComponent(){
        assertTrue(coolingSystemPart.coolingSystemComponent());
    }

    @Test
    public void engineComponent(){
        assertFalse(coolingSystemPart.engineComponent());
    }

}
