package veiw;

public class Menu {
    private Menu() {
    }

    public static String mainMenu() {
        return "(Main Menu)\n" +
                "1- Start\n" +
                "2- Quit\n";
    }

    public static String secoundMenu() {
        return "(Start The War)\n" +
                "1- Start The War\n" +
                "2- Orange Team\n" +
                "3- Red Team\n" +
                "4- Back\n";
    }

    public static String orangeMenu() {
        return "(Orange Team)\n" + teamMenu();
    }

    public static String redMenu() {
        return "(Red Team)\n" + teamMenu();
    }

    private static String teamMenu() {
        return "1- Attack\n" +
                "2- Show List of Soldiers\n" +
                "3- Show List of Dead\n" +
                "4- Back";

    }
}
