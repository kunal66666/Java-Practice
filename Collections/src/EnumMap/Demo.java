package EnumMap;

import java.util.EnumMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {

        Map<Day,String> map=new EnumMap<>(Day.class);
         map.put(Day.MONDAY,"Gym");
         map.put(Day.TUESDAY,"TADSK");
         System.out.println(map);

         //enum map is also array of same size ofg enum
        //no hasing it using ordinal or indexing
    }
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
}
