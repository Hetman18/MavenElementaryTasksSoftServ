package tickets;

import java.util.Scanner;

public class InPutValue {
    Scanner sc = new Scanner(System.in);

    public int getMin() {
        System.out.println("Enter minimal value of ticket: ");
        return sc.nextInt();
    }

    public int getMax() {
        System.out.println("Enter maximal value of ticket: ");
        return sc.nextInt();
    }
}
