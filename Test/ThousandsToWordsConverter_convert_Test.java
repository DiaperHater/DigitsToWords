import org.junit.Test;

import static org.junit.Assert.*;

public class ThousandsToWordsConverter_convert_Test {

    private  final ThousandsToWordsConverter converter = new ThousandsToWordsConverter();

    @Test(expected = IllegalArgumentException.class)
    public void firstArgIsNegative_throwsException(){
        converter.convert(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondArgIsNegative_throwsException(){
        converter.convert(2, -3);
    }

    @Test
    public void argumentsAreOk_noException(){
        converter.convert(2, 3);
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation(){
        assertEquals("тысяча", converter.convert(1, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_2(){
        assertEquals("один", converter.convert(1, 0));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_3(){
        assertEquals("двадцать две тысячи", converter.convert(22, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_4(){
        assertEquals("миллион", converter.convert(1, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_5(){
        assertEquals("шестьдесят один миллион", converter.convert(61, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_6(){
        assertEquals("восемьсот тридцать три миллиона", converter.convert(833, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_7(){
        assertEquals("сто двенадцать миллионов", converter.convert(112, 2));
    }



}