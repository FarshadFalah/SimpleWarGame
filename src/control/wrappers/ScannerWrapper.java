package control.wrappers;

import java.util.Scanner;

public class ScannerWrapper {
    private static final Scanner scanner= new Scanner(System.in);

    private ScannerWrapper(){}

    public static Integer nextInt(){
        return scanner.nextInt();
    }
}
