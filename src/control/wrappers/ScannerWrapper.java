package control.wrappers;

import java.util.Scanner;
/*
**** @author Farshad Fallah
**** @version 1
**** this Class wraps Scanner Class
 */
public class ScannerWrapper {
    private static final Scanner scanner= new Scanner(System.in);

    private ScannerWrapper(){}

    /*
    @return Integer get a Integer from user Console and return it
     */
    public static Integer nextInt(){
        return scanner.nextInt();
    }
}
