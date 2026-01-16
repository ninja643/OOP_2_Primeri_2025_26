package rs.ac.ni.pmf.oop2.primeri.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberInputReader {
    public static int read() {
        final Scanner scanner = new Scanner(System.in);
        int number = -1;

        boolean success = false;
        do{
            try{
                System.out.println("Enter an integer: ");
                number = scanner.nextInt();
                System.out.println("You've entered: "+ number);
                success = true;
                scanner.close();
            } catch(final InputMismatchException e) {
                System.out.println("Please enter an integer.");
                scanner.nextLine();
            }
        } while(!success);

        return number;
    }
}
