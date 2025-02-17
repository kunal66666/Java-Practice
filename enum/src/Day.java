public enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;


    public void display()
    {
        System.out.println("TODAY IS" + this.name());
    }

}
//interanly it is defined as
//public final class Day extends Enum<Day> {
//    public static final Day SUNDAY = new Day("SUNDAY", 0);
//    public static final Day MONDAY = new Day("MONDAY", 1);
//    // Other constants...
//}
