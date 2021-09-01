package parser;

import java.io.File;
import java.util.Scanner;

public class InPutVariable {
    Scanner sc = new Scanner(System.in);

//    public String input() {
//        System.out.println("Enter file Link: ");
//        return sc.nextLine();
//    }

    public String fileLink(String link) {
        System.out.println("Enter file Link: ");
        do {
            link = sc.nextLine();
        } while (!checkLink(new File(link)));
        return link;
    }

    public String matchEnter() {
        System.out.println("Enter string for match it on file: ");
        return sc.nextLine();
    }

    public String stringForChange() {
        System.out.println("Enter 0 if you wont to count entering on text " +
                "or enter string which will paste instead of match string: ");
        return sc.nextLine();
    }

    public boolean checkLink(File link) {
        if (!link.exists()) {
            System.out.println("Wrong link, file doesn't exist!");
            return false;
        } else if (!link.isFile()) {
            System.out.println("Wrong link, file not a file!");
            return false;
        } else if (!link.canRead()) {
            System.out.println("Enter wrong way, can't read file");
            return false;
        }
        return true;
    }
}

