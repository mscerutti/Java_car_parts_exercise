/**
 * Created by localadmin on 1/20/17.
 */
public class EnginePart extends CarPart {

    public EnginePart(String manufacturer, String partNumber, String description) {
        super(manufacturer, partNumber, description);
    }

    Boolean coolingSystemComponent(){
        return false;
    }

    Boolean engineComponent(){
        return true;
    }

}
