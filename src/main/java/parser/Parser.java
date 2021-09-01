package parser;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

public class Parser {

    private String linkOnFile;
    private String matchString;
    private String changeString;

    public Parser(String linkOnFile, String matchString, String changeString) {
        this.linkOnFile = linkOnFile;
        this.matchString = matchString;
        this.changeString = changeString;
    }

    public Parser() {

    }

    public String getLinkOnFile() {
        return linkOnFile;
    }

    public String getMatchString() {
        return matchString;
    }

    public String getChangeString() {
        return changeString;
    }

    public String readFile(String linkOnFile) throws IOException {
        String fileRead = "";
        File fileReading;
        fileReading = new File(linkOnFile);
        fileRead = Files.readString(fileReading.toPath());
        return fileRead;
    }

    public int matchText(String text, String matchString) throws IOException {
//        text = readFile(getLinkOnFile());
        int matchCounter = (text.split(matchString, 0).length - 1);
        return matchCounter;
    }

    public void outPutMatchText() throws IOException {
        System.out.println(matchText(readFile(getLinkOnFile()), getMatchString()));
    }

    public String changeStringMethod(String fileLink, String matchString, String stringForChange) throws
            IOException {
        String text = readFile(fileLink);
        text = text.replaceAll(matchString, stringForChange);
        return text;
    }

    public void writingChanges() throws IOException {
        String text = changeStringMethod(getLinkOnFile(), getMatchString(), getChangeString());
        String linkForWriting = getLinkOnFile();
        FileWriter writer = new FileWriter(linkForWriting);
        writer.write(text);
        System.out.println(text);
        writer.flush();
        writer.close();
    }


}
