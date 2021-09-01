package parser;

import java.io.IOException;

public class FirstParserObject {

    public void firstParser() throws IOException {
        InPutVariable inPut = new InPutVariable();
        Parser emptyParser = new Parser();
        Parser parser1 = new Parser(inPut.fileLink(emptyParser.getLinkOnFile()), inPut.matchEnter(), inPut.stringForChange());
        if (parser1.getChangeString().equals("0")) {
            parser1.outPutMatchText();
        } else {
            parser1.writingChanges();
        }
    }
}
