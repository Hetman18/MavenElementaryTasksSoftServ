package parser;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class ParserTest extends Assert {
    Parser parser = new Parser();

    @Test // не работает
    public void testReadFile() throws IOException {
        String link = "src/test/java/parser/ParsText.txt";
        String expectedText = "Мама Милу мылом мыла.";
        assertEquals(parser.readFile(link), expectedText);
    }

    @Test
    public void positiveMatchText() throws IOException {
        int expectedResult = 6;
        assertEquals(parser.matchText("Мама Мила мылом мыла.", "[Мм]"), expectedResult);
    }

    @Test
    public void negativeMatchText() throws IOException {
        int expectedResult = 25;
        assertNotEquals(parser.matchText("Мама Мила мылом мыла.", "[Мм]"), expectedResult);
    }

    @Test // не работает (((
    public void changeStringMethod() throws IOException {
        String expectedResult = "Не жалела мама пурума.\n" +
                "Мама Мила пурумом пурума.\n";
        assertNotEquals(parser.changeStringMethod("src/test/java/parser/ChangeText.txt", "мыл", "пурум"),expectedResult);
    }
}