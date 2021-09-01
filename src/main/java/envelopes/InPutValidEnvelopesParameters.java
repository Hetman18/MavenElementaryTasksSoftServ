package envelopes;

import java.util.Scanner;

class InPutValidEnvelopesParameters {
    private Scanner sc = new Scanner(System.in);

    float getEnvelopeSideA() {
        System.out.println("Enter float side A: ");
        return inputValidFloatParameters();
    }

    float getEnvelopeSideB() {
        System.out.println("Enter float side B: ");
        return inputValidFloatParameters();
    }

    float getEnvelopeSideC() {
        System.out.println("Enter float side C: ");
        return inputValidFloatParameters();
    }

    float getEnvelopeSideD() {
        System.out.println("Enter float side D: ");
        return inputValidFloatParameters();
    }

    private float inputValidFloatParameters() {
        float parameter;
        while (true) {
            try {
                parameter = Float.parseFloat(sc.nextLine());
                while (parameter <= 0) {
                    System.err.println("Please enter positive float parameter less 80!");
                    parameter = Float.parseFloat(sc.nextLine());
                }
            } catch (NumberFormatException e) {
                System.err.println("Wrong input format");
                continue;
            }
            return parameter;
        }
    }

}

