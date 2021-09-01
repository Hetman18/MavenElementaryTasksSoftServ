package sequence;

import java.util.Scanner;

public class InPutValidation {
    Scanner sc = new Scanner(System.in);

    public int inputNumber(String question) {
        System.out.println(question);
        boolean state = false;
        String input = "";
        while (!state) {
            System.out.println("Enter one more time: ");
            input = input();
            state = validateInput(input);
        }
        return Integer.parseInt(input);
    }

    private String input() {
        return sc.nextLine();
    }

    private boolean validateInput(String inputNumber) {
        int valueAfterParse = 0;
        try {
            valueAfterParse = Integer.parseInt(inputNumber);
            if (valueAfterParse <= 0) {
                System.out.println("Enter Positive number");
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

