import java.lang.StringBuilder;
import java.lang.reflect.Field;

/**
 * Created by localadmin on 1/20/17.
 */
public class CarPart {
    String manufacturer;
    String partNumber;
    String description;

    public CarPart(String manufacturer, String partNumber, String description) {
        this.manufacturer = manufacturer;
        this.partNumber = partNumber;
        this.description = description;

    }

    String fullDescription() throws IllegalAccessException {

        return String.format("manufacturer: %1s, partNumber: %2s, description: %3s",
                manufacturer,
                partNumber,
                description);


//        try {
//            StringBuilder sb = new StringBuilder();
//
//            for (Field f : getClass().getDeclaredFields()) {
//                sb.append(f.getName());
//                sb.append(": ");
//                sb.append(f.get(this));
//                sb.append(", ");
//            }
//            return sb.substring(0,sb.length()-2);
//        }
//        catch(IllegalAccessException e){
//            throw e;
//        }

    }
}