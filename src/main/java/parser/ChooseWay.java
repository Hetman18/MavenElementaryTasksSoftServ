package parser;

import java.io.IOException;
import java.util.Scanner;

public class ChooseWay {
    public boolean analyseWay() {
        System.out.println("Enter 'yes' if you want to continue, and else if you want to exit: ");
        Scanner sc = new Scanner(System.in);
        String way = sc.nextLine();
        return (way.equals("yes") || way.equals("y"));
    }

    public void chooseWay() throws IOException {
        boolean way = true;
        while (way) {
            new FirstParserObject().firstParser();
            way = analyseWay();
        }
    }
}

