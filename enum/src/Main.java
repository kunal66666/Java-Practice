//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Day monday=Day.MONDAY;
    System.out.println(monday.ordinal());
    monday.display();


        String day = "SUN";
        String typeOfDay = switch (day) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
            case "SATURDAY", "SUNDAY" -> "Weekend";
            default -> "Invalid day";
        };

        System.out.println("Today is a: " + typeOfDay);




//        String day = "MONDAY";
//
//        switch (day) {
//            case "MONDAY":
//            case "TUESDAY":
//            case "WEDNESDAY":
//                System.out.println("It's a weekday.");
//                break;
//            case "SATURDAY":
//            case "SUNDAY":
//                System.out.println("It's the weekend!");
//                break;
//            default:
//                System.out.println("Invalid day.");
//                break;
//        }
//    }
    }
}