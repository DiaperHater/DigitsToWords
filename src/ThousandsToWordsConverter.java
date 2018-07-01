public class ThousandsToWordsConverter {

    private Formatter formatter = new Formatter();
    private ThousandNameListDao thousandNameListDao = new ThousandNameListDao();

    public String convert(int number, int exponentOfThousand){

        if (number < 0 || exponentOfThousand < 0){
            throw new IllegalArgumentException("number = " + number + " cant be negative!");
        }

        String numeralPrefix = formatter.formatFirstThreeDigits(number);

        if (exponentOfThousand == 0){
            return numeralPrefix;
        }

        String numeralSuffix = thousandNameListDao.getName(exponentOfThousand);

        if (number == 1){
            return numeralSuffix;
        }

        int lastDigit = number % 10;
        if (lastDigit == 1){
            return numeralPrefix +" "+ numeralSuffix;
        }

        if (lastDigit > 1 && lastDigit < 5){

            if (exponentOfThousand == 1){
                numeralPrefix = replaceLastCharacters(numeralPrefix, 1, "е");
                return numeralPrefix +" "+ replaceLastCharacters(numeralSuffix, 1, "и");
            }

            numeralSuffix = replaceLastCharacters(numeralSuffix, 0, "а");
            return numeralPrefix +" "+ numeralSuffix;

        }


        return "";
    }

    private String replaceLastCharacters(String targetString, int countOfCharsToReplace, String replacement){
        return targetString.substring(0, targetString.length() - countOfCharsToReplace)+replacement;
    }
}
