package sequence;

import java.util.ArrayList;
import java.util.List;

public class Sequence {     //name
    private int maxSquare;
    private int lengthNumber;

    public Sequence(int maxSquare, int lengthNumber) {
        this.maxSquare = maxSquare;
        this.lengthNumber = lengthNumber;
    }

    public Sequence() {
    }

    public int getLengthNumber() {
        return lengthNumber;
    }

    public int maxSquare() {
        return maxSquare;
    }

    public int sqrtFromMaxSquare(int numberSqrt) {
        double sqrtMaxSquare = Math.ceil(Math.sqrt(numberSqrt));
        return (int) sqrtMaxSquare;
    }

    public void outputSequence() { // move out
        for (Integer number : getSequence(sqrtFromMaxSquare(maxSquare), getLengthNumber())) { // rename
            System.out.print(number + " ");
        }
    }

    public List<Integer> getSequence(int startSequence, int sequenceLength) {
        List<Integer> sequenceArray = new ArrayList<>();
        for (int i = 0; i < sequenceLength; i++) {
            sequenceArray.add(startSequence++);
        }
        return sequenceArray;
    }
}
