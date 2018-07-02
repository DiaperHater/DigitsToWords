import org.junit.Test;

import static org.junit.Assert.*;

public class ThreeDigitFormatter_formatFirstThreeDigits_Test {

    private final ThreeDigitFormatter formatter = new ThreeDigitFormatter();

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument_throwsException(){
        formatter.formatFirstThreeDigits(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void illegalArgument_throwsException_2(){
        formatter.formatFirstThreeDigits(1000);
    }

    @Test
    public void argumentIsOk_noExceptionThrown(){
        formatter.formatFirstThreeDigits(898);
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation(){
        assertEquals("сто", formatter.formatFirstThreeDigits(100));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_2(){
        assertEquals("сто двадцать девять", formatter.formatFirstThreeDigits(129));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_3(){
        assertEquals("ноль", formatter.formatFirstThreeDigits(0));
    }

    @Test
    public void argumentIsOk_returnsNumberInWordRepresentation_4(){
        assertEquals("двести семьдесят один", formatter.formatFirstThreeDigits(271));
    }
}