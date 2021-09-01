package sequence;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InPutParametersTest extends Assert{
    InPutValidation inputValidation = new InPutValidation();

    @Test
    public void negativeValidateInput() {
        assertFalse(inputValidation.validateInput("X"));
    }

    @Test
    public void positiveValidateInput() {
        assertTrue(inputValidation.validateInput("2000"));
    }
}
