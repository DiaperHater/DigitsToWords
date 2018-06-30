import java.math.BigInteger;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

import static java.lang.Math.pow;

public class Formatter {
    private Map<Integer , String> firstDigitMap = new LinkedHashMap();
    private Map<Integer , String> secondDigitMap = new LinkedHashMap();
    private Map<Integer , String> thirdDigitMap = new LinkedHashMap();

    public Formatter() {
        fillFirstDigitMap();
        fillSecondDigitMap();
        fillThirdDigitMap();
    }


    public static void main(String[] args) {



        BigInteger num = new BigInteger("654372759012387654321");
        ArrayList<Integer> thousands = new ArrayList<>();

        System.out.println(num);
        System.out.println();

        BigInteger thousand = new BigInteger("1000");

        for (int i = 0; thousand.pow(i).compareTo(num) <= 0;i++){
            thousands.add( ( num.divide( thousand.pow(i) ).remainder(thousand).intValue() ));
            System.out.println(thousands.get(i));
        }

        System.out.println();
        System.out.println(thousands);

    }

    public String formatFirstDigit(Integer num) {

        if(num < 0 || num > 9){
            throw new IllegalArgumentException("argument = " + num.toString());
        }

        return firstDigitMap.get(num);
    }

    public String formatFirstTwoDigits(Integer num){

        if(num < 0 || num > 99){
            throw new IllegalArgumentException("argument = " + num);
        }

        if (num < 10){
            return formatFirstDigit(num);
        }

        if (num < 20){
            return secondDigitMap.get(num);
        }

        int secondDigit = num / 10;
        String result = secondDigitMap.get(secondDigit);
        int firstDigit = num % 10;

        if (firstDigit != 0){
            result += " " + firstDigitMap.get(firstDigit);
        }

        return result;
    }

    public String formatFirstThreeDigits(Integer num){

        if (num < 0 || num > 999){
            throw new IllegalArgumentException("argument = " + num);
        }


        String result = "";

        if(num > 99){
            result = thirdDigitMap.get(num / 100) + " ";
        }
        result += formatFirstTwoDigits(num % 100);
        result = result.replaceAll(" ноль","");

        return result;
    }

    private void fillFirstDigitMap() {
        firstDigitMap.put(0, "ноль");
        firstDigitMap.put(1, "один");
        firstDigitMap.put(2, "два");
        firstDigitMap.put(3, "три");
        firstDigitMap.put(4, "четыре");
        firstDigitMap.put(5, "пять");
        firstDigitMap.put(6, "шесть");
        firstDigitMap.put(7, "семь");
        firstDigitMap.put(8, "восемь");
        firstDigitMap.put(9, "девять");
    }

    private void fillSecondDigitMap() {

        secondDigitMap.put(10, "десять");
        secondDigitMap.put(11, "одинадцать");
        secondDigitMap.put(12, "двенадцать");
        secondDigitMap.put(13, "тринадцать");
        secondDigitMap.put(14, "четырнадцать");
        secondDigitMap.put(15, "пятнадцать");
        secondDigitMap.put(16, "шестнадцать");
        secondDigitMap.put(17, "семнадцать");
        secondDigitMap.put(18, "восемнадцать");
        secondDigitMap.put(19, "девятнадцать");
        secondDigitMap.put(2,"двадцать");
        secondDigitMap.put(3,"тридцать");
        secondDigitMap.put(4,"сорок");
        secondDigitMap.put(5,"пятьдесят");
        secondDigitMap.put(6,"шестьдесят");
        secondDigitMap.put(7,"семьдесят");
        secondDigitMap.put(8,"восемьдесят");
        secondDigitMap.put(9,"девяносто");
    }

    private void fillThirdDigitMap() {
        thirdDigitMap.put(1, "сто");
        thirdDigitMap.put(2, "двести");
        thirdDigitMap.put(3, "триста");
        thirdDigitMap.put(4, "четыреста");
        thirdDigitMap.put(5, "пятьсот");
        thirdDigitMap.put(6, "шестьсот");
        thirdDigitMap.put(7, "семьсот");
        thirdDigitMap.put(8, "восемьсот");
        thirdDigitMap.put(9, "девятьсот");
    }
}
