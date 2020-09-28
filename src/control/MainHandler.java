package control;

import control.wrappers.ScannerWrapper;
import model.barraks.Squad;
import veiw.Menu;

public class MainHandler {
    Squad squadOrange = new Squad("Orange", 10);
    Squad squadRed = new Squad("Red", 10);
    int i = 0;

    public void init() {
        handleMainMenu();
    }

    private Integer menuHandler(String menu) {
        System.out.println(menu);
        System.out.print("Please Enter your Choice: ");
        return ScannerWrapper.nextInt();
    }

    private void handleMainMenu() {
        while (true) {
            int choice = menuHandler(Menu.mainMenu());
            switch (choice) {
                case 1:
                    secoundMenuHandler();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("Wrong Answer Please Choose Another Answer\n");
                    break;
            }
        }
    }

    private void secoundMenuHandler() {
        while (true) {
            int choice = menuHandler(Menu.secoundMenu());
            switch (choice) {
                case 1:
                    war();
                    break;
                case 2:
                    orangeMenu();
                    break;
                case 3:
                    redMenu();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong Answer Please Choose Another Answer\n");
                    break;
            }
        }
    }

    public void orangeMenu(){
        System.out.println(squadOrange);
        while (true) {
            int choice = menuHandler(Menu.orangeMenu());
            switch (choice) {
                case 1:
                    if(squadRed.size()>0&&squadOrange.size()>0) {
                        i++;
                        squadOrange.attack(squadRed,"Orange","Red");
                        System.out.println("========Round" + i + "========");
                        System.out.println(squadOrange);
                        System.out.println(squadRed);
                    }else if (squadOrange.size()==0){
                        System.err.println("War is Lost. No One Remains to Fight.");
                    }else {
                        System.err.println("You Won The War.");
                    }
                    break;
                case 2:
                    System.out.println(squadOrange);
                    break;
                case 3:
                    System.out.println(squadOrange.deadSoldiers());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong Answer Please Choose Another Answer\n");
                    break;
            }
        }
    }

    public void redMenu(){
        System.out.println(squadRed);
        while (true) {
            int choice = menuHandler(Menu.redMenu());
            switch (choice) {
                case 1:
                    if(squadRed.size()>0&&squadOrange.size()>0) {
                        i++;
                        squadRed.attack(squadOrange,"Red","Orange");
                        System.out.println("========Round" + i + "========");
                        System.out.println(squadOrange);
                        System.out.println(squadRed);
                    }else if (squadRed.size()==0){
                        System.err.println("War is Lost. No One Remains to Fight");
                    }else {
                        System.err.println("You Won The War.");
                    }
                    break;
                case 2:
                    System.out.println(squadRed);
                    break;
                case 3:
                    System.out.println(squadRed.deadSoldiers());
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Wrong Answer Please Choose Another Answer\n");
                    break;
            }
        }
    }


    public void war() {
        while (squadOrange.size() > 0&&squadRed.size() > 0){
                i++;
                System.out.println("========Round" + i + "========");
                System.out.println(squadOrange);
                System.out.println(squadRed);
                squadRed.attack(squadOrange,"Red","Orange");
                if (squadOrange.size() > 0) {
                    squadOrange.attack(squadRed,"Orange","Red");
                }
            }
        if (squadOrange.size() == 0) {
            System.out.println("============= Winner is Squad Red =============");
            System.out.println("Dead Soldiers in Squad Red are" + squadRed.deadSoldiers());
            System.out.println("Dead Soldiers in Squad Orange are" + squadOrange.deadSoldiers());
        }else if (squadRed.size() == 0) {
            System.out.println("============= Winner is Squad Orange =============");
            System.out.println("Dead Soldiers in Squad Red are" + squadRed.deadSoldiers());
            System.out.println("Dead Soldiers in Squad Orange are" + squadOrange.deadSoldiers());
        }

    }


}

