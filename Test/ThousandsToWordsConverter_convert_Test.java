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
        assertEquals("тысяча", converter.convert(1, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_4(){
        assertEquals("миллион", converter.convert(1, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_5(){
        assertEquals("шестьдесят один", converter.convert(61, 0));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_6(){
        assertEquals("двенадцать тысяч", converter.convert(12, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_7(){
        assertEquals("сто двадцать пять тысяч", converter.convert(125, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_8(){
        assertEquals("две тысячи", converter.convert(2, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_9(){
        assertEquals("восемьсот семьдесят две тысячи", converter.convert(872, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_10(){
        assertEquals("три тысячи", converter.convert(3, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_11(){
        assertEquals("сорок четыре тысячи", converter.convert(44, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_12(){
        assertEquals("двадцать одна тысяча", converter.convert(21, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_13(){
        assertEquals("семьдесят тысяч", converter.convert(70, 1));
    }

    ////////////////////////////////////

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_14(){
        assertEquals("двадцать один миллион", converter.convert(21, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_15(){
        assertEquals("сорок один миллиард", converter.convert(41, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_16(){
        assertEquals("два миллиона", converter.convert(2, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_17(){
        assertEquals("девятьсот девяносто два миллиарда", converter.convert(992, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_18(){
        assertEquals("три миллиона", converter.convert(3, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_19(){
        assertEquals("сто тридцать три тредециллиона", converter.convert(133, 14));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_20(){
        assertEquals("четыре миллиона", converter.convert(4, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_21(){
        assertEquals("пять миллионов", converter.convert(5, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_22(){
        assertEquals("семьдесят миллионов", converter.convert(70, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_23(){
        assertEquals("сто миллионов", converter.convert(100, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_24(){
        assertEquals("сто тысяч", converter.convert(100, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_25(){
        assertEquals("двести тысяч", converter.convert(200, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_26(){
        assertEquals("двести миллионов", converter.convert(200, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_27(){
        assertEquals("триста тысяч", converter.convert(300, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_28(){
        assertEquals("триста миллиардов", converter.convert(300, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_29(){
        assertEquals("четыреста тысяч", converter.convert(400, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_30(){
        assertEquals("четыреста миллионов", converter.convert(400, 2));
    }







}