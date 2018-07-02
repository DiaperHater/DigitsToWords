import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentOfThousandFormatter_convert_Test {

    private  final ExponentOfThousandFormatter converter = new ExponentOfThousandFormatter();

    @Test(expected = IllegalArgumentException.class)
    public void firstArgIsNegative_throwsException(){
        converter.format(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondArgIsNegative_throwsException(){
        converter.format(2, -3);
    }

    @Test
    public void argumentsAreOk_noException(){
        converter.format(2, 3);
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation(){
        assertEquals("тысяча", converter.format(1, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_2(){
        assertEquals("один", converter.format(1, 0));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_3(){
        assertEquals("тысяча", converter.format(1, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_4(){
        assertEquals("миллион", converter.format(1, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_5(){
        assertEquals("шестьдесят один", converter.format(61, 0));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_6(){
        assertEquals("двенадцать тысяч", converter.format(12, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_7(){
        assertEquals("сто двадцать пять тысяч", converter.format(125, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_8(){
        assertEquals("две тысячи", converter.format(2, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_9(){
        assertEquals("восемьсот семьдесят две тысячи", converter.format(872, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_10(){
        assertEquals("три тысячи", converter.format(3, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_11(){
        assertEquals("сорок четыре тысячи", converter.format(44, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_12(){
        assertEquals("двадцать одна тысяча", converter.format(21, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_13(){
        assertEquals("семьдесят тысяч", converter.format(70, 1));
    }

    ////////////////////////////////////

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_14(){
        assertEquals("двадцать один миллион", converter.format(21, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_15(){
        assertEquals("сорок один миллиард", converter.format(41, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_16(){
        assertEquals("два миллиона", converter.format(2, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_17(){
        assertEquals("девятьсот девяносто два миллиарда", converter.format(992, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_18(){
        assertEquals("три миллиона", converter.format(3, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_19(){
        assertEquals("сто тридцать три тредециллиона", converter.format(133, 14));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_20(){
        assertEquals("четыре миллиона", converter.format(4, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_21(){
        assertEquals("пять миллионов", converter.format(5, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_22(){
        assertEquals("семьдесят миллионов", converter.format(70, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_23(){
        assertEquals("сто миллионов", converter.format(100, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_24(){
        assertEquals("сто тысяч", converter.format(100, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_25(){
        assertEquals("двести тысяч", converter.format(200, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_26(){
        assertEquals("двести миллионов", converter.format(200, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_27(){
        assertEquals("триста тысяч", converter.format(300, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_28(){
        assertEquals("триста миллиардов", converter.format(300, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_29(){
        assertEquals("четыреста тысяч", converter.format(400, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_30(){
        assertEquals("четыреста миллионов", converter.format(400, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_31(){
        assertEquals("сорок тысяч", converter.format(40, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_32(){
        assertEquals("сорок миллионов", converter.format(40, 2));
    }







}