import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Formatter {
    private Map<Integer , String> firstDigitMap = new LinkedHashMap();
    private Map<Integer , String> secondDigitMap = new LinkedHashMap();

    public Formatter() {
        fillFirstDigitMap();
        fillSecondDigitMap();
    }

    public static void main(String[] args) {

        Formatter formatter = new Formatter();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            Integer r = random.nextInt(99);
            System.out.println(r + " = " + formatter.formatFirstTwoDigits(r));
        }


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
        secondDigitMap.put(6,"шестдесят");
        secondDigitMap.put(7,"семдесят");
        secondDigitMap.put(8,"восемдесят");
        secondDigitMap.put(9,"девяносто");
    }
}
