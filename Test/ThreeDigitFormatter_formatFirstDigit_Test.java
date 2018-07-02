import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeDigitFormatter_formatFirstDigit_Test {

    private ThreeDigitFormatter formatter = new ThreeDigitFormatter();


    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument_ThrowsException(){
        formatter.formatFirstDigit(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument_ThrowsException_2(){
        formatter.formatFirstDigit(10);
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation() {
        assertEquals("пять", formatter.formatFirstDigit(5));
    }


    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_2() {
        assertEquals("девять", formatter.formatFirstDigit(9));
    }
}