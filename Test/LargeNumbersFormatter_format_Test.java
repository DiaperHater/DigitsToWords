import org.junit.Test;

import static org.junit.Assert.*;

public class LargeNumbersFormatter_format_Test {

    private final LargeNumbersFormatter formatter = new LargeNumbersFormatter();

    @Test(expected = NumberFormatException.class)
    public void argIsNotNumber_throwsException(){
        formatter.format("123dfr");
    }

    @Test(expected = IllegalArgumentException.class)
    public void argIsNegativeNumber_trowsException(){
        formatter.format("-123456");
    }

    @Test
    public void argIsOk_noException(){
        formatter.format("9876123456");
    }

    @Test
    public void argIsOk_returnsNumberInWordRepresentation(){
        assertEquals("ноль", formatter.format("0"));
    }




}