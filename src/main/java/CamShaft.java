/**
 * Created by localadmin on 1/20/17.
 */
public class CamShaft  extends EnginePart {
    Integer duration;
    Integer lift;
    Integer timing;

    public CamShaft(String manufacturer, String partNumber, String description,Integer duration, Integer lift, Integer timing) {
        super(manufacturer, partNumber, description);
        this.duration = duration;
        this.lift = lift;
        this.timing = timing;
    }
    String fullDescription()  throws IllegalAccessException{

        return String.format("manufacturer: %1s, partNumber: %2s, description: %3s, duration: %4$1d, lift: %5$1d, timing: %6$1d",
                manufacturer,
                partNumber,
                description,
                duration,
                lift,
                timing);
    }

}
