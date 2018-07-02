import java.util.Random;

public class ExponentOfThousandFormatter {

    private ThreeDigitFormatter formatter = new ThreeDigitFormatter();
    private NamesOfLargeNumbersDao namesOfLargeNumbersDao = new NamesOfLargeNumbersDao();

    public String format(int number, int exponentOfThousand){

        checkArgument(number);
        checkArgument(exponentOfThousand);

        String prefix = formatter.formatFirstThreeDigits(number);

        if (exponentOfThousand == 0){
            return prefix;
        }

        String suffix = namesOfLargeNumbersDao.getName(exponentOfThousand);

        if (number == 1){
            return suffix;
        }
        ////////////////////////////

        if (exponentOfThousand == 1){// тысяча
            return formatThousand(prefix, suffix);
        }

        return formatRest(prefix, suffix);
    }

    private String formatRest(String prefix, String suffix) {
        if (prefix.toCharArray()[prefix.length()-1] == 'н'){
            return prefix +" "+ suffix;
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'а'){
            if (prefix.equals("триста") || prefix.equals("четыреста")){
                return prefix +" "+ replaceLastCharacters(suffix, 0, "ов");
            }
            return prefix +" "+ replaceLastCharacters(suffix, 0, "а");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'и'){
            if (prefix.equals("двести")){
                return prefix +" "+ replaceLastCharacters(suffix, 0, "ов");
            }
            return prefix +" "+ replaceLastCharacters(suffix, 0, "а");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'е'){
            return prefix +" "+ replaceLastCharacters(suffix, 0, "а");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'ь'){
            return prefix +" "+ replaceLastCharacters(suffix, 0, "ов");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'т'){
            return prefix +" "+ replaceLastCharacters(suffix, 0, "ов");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'о'){
            return prefix +" "+ replaceLastCharacters(suffix, 0, "ов");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'к'){
            return prefix +" "+ replaceLastCharacters(suffix, 0, "ов");
        }

        throw new RuntimeException();
    }

    private String formatThousand(String prefix, String suffix) {
        if (prefix.toCharArray()[prefix.length()-1] == 'ь'){
            return prefix +" "+ replaceLastCharacters(suffix, 1, "");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'а'){
            if (prefix.equals("триста") || prefix.equals("четыреста")){
                return prefix +" "+ replaceLastCharacters(suffix, 1, "");
            }
            return replaceLastCharacters(prefix, 1, "е") +
                    " " + replaceLastCharacters(suffix, 1, "и");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'и'){
            if (prefix.equals("двести")){
                return prefix +" "+ replaceLastCharacters(suffix, 1, "");
            }
            return prefix +" "+ replaceLastCharacters(suffix, 1, "и");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'е'){
            return prefix +" "+ replaceLastCharacters(suffix, 1, "и");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'н'){
            return replaceLastCharacters(prefix, 2, "на") +
                    " " + suffix;
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'т'){
            return prefix +" "+ replaceLastCharacters(suffix, 1, "");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'о'){
            return prefix +" "+ replaceLastCharacters(suffix, 1, "");
        }
        if (prefix.toCharArray()[prefix.length()-1] == 'к'){
            return prefix +" "+ replaceLastCharacters(suffix, 1, "");
        }

        throw new RuntimeException();
    }

    private void checkArgument(int arg) {
        if (arg < 0){
            throw new IllegalArgumentException("arg = " + arg + " cant be negative!");
        }
    }

    private String replaceLastCharacters(String targetString, int countOfCharsToReplace, String replacement){
        return targetString.substring(0, targetString.length() - countOfCharsToReplace)+replacement;
    }

    public static void main(String[] args) {
        Random random = new Random(99);
        ExponentOfThousandFormatter formatter = new ExponentOfThousandFormatter();

        for (int i = 0; i < 100000; i++) {
            System.out.println(formatter.format(random.nextInt(999), random.nextInt(33)));
        }
    }
}
