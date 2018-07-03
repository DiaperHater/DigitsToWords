import org.junit.Test;

import static org.junit.Assert.*;

public class ExponentOfThousand_convert_Test {

    private  final ExponentOfThousand converter = new ExponentOfThousand();

    @Test(expected = IllegalArgumentException.class)
    public void firstArgIsNegative_throwsException(){
        converter.asWords(-2, 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void secondArgIsNegative_throwsException(){
        converter.asWords(2, -3);
    }

    @Test
    public void argumentsAreOk_noException(){
        converter.asWords(2, 3);
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation(){
        assertEquals("тысяча", converter.asWords(1, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_2(){
        assertEquals("один", converter.asWords(1, 0));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_3(){
        assertEquals("тысяча", converter.asWords(1, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_4(){
        assertEquals("миллион", converter.asWords(1, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_5(){
        assertEquals("шестьдесят один", converter.asWords(61, 0));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_6(){
        assertEquals("двенадцать тысяч", converter.asWords(12, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_7(){
        assertEquals("сто двадцать пять тысяч", converter.asWords(125, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_8(){
        assertEquals("две тысячи", converter.asWords(2, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_9(){
        assertEquals("восемьсот семьдесят две тысячи", converter.asWords(872, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_10(){
        assertEquals("три тысячи", converter.asWords(3, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_11(){
        assertEquals("сорок четыре тысячи", converter.asWords(44, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_12(){
        assertEquals("двадцать одна тысяча", converter.asWords(21, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_13(){
        assertEquals("семьдесят тысяч", converter.asWords(70, 1));
    }

    ////////////////////////////////////

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_14(){
        assertEquals("двадцать один миллион", converter.asWords(21, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_15(){
        assertEquals("сорок один миллиард", converter.asWords(41, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_16(){
        assertEquals("два миллиона", converter.asWords(2, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_17(){
        assertEquals("девятьсот девяносто два миллиарда", converter.asWords(992, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_18(){
        assertEquals("три миллиона", converter.asWords(3, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_19(){
        assertEquals("сто тридцать три тредециллиона", converter.asWords(133, 14));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_20(){
        assertEquals("четыре миллиона", converter.asWords(4, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_21(){
        assertEquals("пять миллионов", converter.asWords(5, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_22(){
        assertEquals("семьдесят миллионов", converter.asWords(70, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_23(){
        assertEquals("сто миллионов", converter.asWords(100, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_24(){
        assertEquals("сто тысяч", converter.asWords(100, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_25(){
        assertEquals("двести тысяч", converter.asWords(200, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_26(){
        assertEquals("двести миллионов", converter.asWords(200, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_27(){
        assertEquals("триста тысяч", converter.asWords(300, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_28(){
        assertEquals("триста миллиардов", converter.asWords(300, 3));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_29(){
        assertEquals("четыреста тысяч", converter.asWords(400, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_30(){
        assertEquals("четыреста миллионов", converter.asWords(400, 2));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_31(){
        assertEquals("сорок тысяч", converter.asWords(40, 1));
    }

    @Test
    public void argumentsAreOk_returnsNumberInWordRepresentation_32(){
        assertEquals("сорок миллионов", converter.asWords(40, 2));
    }







}