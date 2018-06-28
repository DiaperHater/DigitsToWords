import org.junit.Test;

import static org.junit.Assert.*;

public class Formatter_formatFirstDigit_Test {

    private Formatter formatter = new Formatter();


    @Test(expected = IllegalArgumentException.class)
    public void illigalArgument_ThrowsException(){
        formatter.formatFirstDigit(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illigalArgument_ThrowsException_2(){
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