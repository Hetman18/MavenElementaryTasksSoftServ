package sequence;

public class SequenceMain {

    public static void main(String[] args) {
        InPutValidation input = new InPutValidation();
        Sequence numberSequence = new Sequence(input.inputNumber("Please enter a positive number of M parameter:"),
                input.inputNumber("Please enter a positive number of sequence length:"));
        numberSequence.outputSequence();
    }
}
