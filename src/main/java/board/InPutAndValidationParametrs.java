package board;

import java.util.Scanner;

public class InPutAndValidationParametrs {
    public Scanner sc = new Scanner(System.in);

    public int inputValidParameters() {
        int parameter = 0;
        while (true) {
            try {
                parameter = Integer.parseInt(sc.nextLine());
                while (parameter <= 0 || parameter > 80) {
                    System.err.println("Please enter positive integer parameter less 80!");
                    parameter = Integer.parseInt(sc.nextLine());
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            return parameter;
        }
    }
}

