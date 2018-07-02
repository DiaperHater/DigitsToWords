import org.junit.Test;

import static org.junit.Assert.*;

public class NumberToWordRepresentationFormatter_format_Test {

    private final NumberToWordRepresentationFormatter formatter = new NumberToWordRepresentationFormatter();

    @Test(expected = NumberFormatException.class)
    public void argIsNotNumber_throwsException(){
        formatter.format("123dfr");
    }

    @Test
    public void argIsOk_noException(){
        formatter.format("9876123456");
    }

    @Test
    public void argIsOk_returnsNumberInWordRepresentation(){
        assertEquals("ноль", formatter.format("0"));
    }

    @Test
    public void argIsOk_returnsNumberInWordRepresentation_2(){
        assertEquals("две тысячи два", formatter.format("2002"));
    }

    @Test
    public void argIsOk_returnsNumberInWordRepresentation_3(){
        assertEquals("минус три", formatter.format("-3"));
    }


}