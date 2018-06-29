import org.junit.Test;

import static org.junit.Assert.*;

public class Formatter_formatFirstTwoDigits_Test {

    private final Formatter formatter = new Formatter();

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument_trowsException() {
        formatter.formatFirstTwoDigits(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument_trowsException_2() {
        formatter.formatFirstTwoDigits(100);
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation() {
        assertEquals("два", formatter.formatFirstTwoDigits(2));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_2() {
        assertEquals("двадцать четыре", formatter.formatFirstTwoDigits(24));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_3() {
        assertEquals("пятьдесят шесть", formatter.formatFirstTwoDigits(56));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_4() {
        assertEquals("девяносто", formatter.formatFirstTwoDigits(90));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_5() {
        assertEquals("девяносто один", formatter.formatFirstTwoDigits(91));
    }


    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_6() {
        assertEquals("семнадцать", formatter.formatFirstTwoDigits(17));
    }
}