/**
 * Created by localadmin on 1/20/17.
 */
public class CoolingSystemPart extends CarPart {

    public CoolingSystemPart(String manufacturer, String partNumber, String description) {
        super(manufacturer, partNumber, description);
    }

    Boolean coolingSystemComponent(){
        return true;
    }

    Boolean engineComponent(){
        return false;
    }

}
