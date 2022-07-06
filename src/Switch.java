public class Switch {
    public static void main(String[] args) {
        String day = "Saturday";
        switch (day) {
            case "Monday":
                System.out.println("First day of week");
                    break;
            case "Tuesday":
                System.out.println("No Non-veg day");
                    break;
            case "Wednesday":
                System.out.println("Day after No Non-veg day");
                    break;
            case "Thurday":
                System.out.println("Pray day");
                break;
            case "Friday":
                System.out.println("Day before weekend");
                break;
            case "Saturday":
                System.out.println("Weekend starts");
                break;
            case "Sunday":
                System.out.println("Weekend last day");
                break;
            default:
                System.out.println("No matching");
        }

    }
}
