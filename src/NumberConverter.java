import java.math.BigInteger;
import java.util.ArrayList;


public class NumberConverter {

    private final ExponentOfThousand exponentOfThousand = new ExponentOfThousand();
    private final BigInteger ONE_THOUSAND = new BigInteger("1000");


    public String asWords(String n){

        BigInteger number = new BigInteger(n);
        if (number.signum() == 0){
            return "ноль";
        }

        String sign = "";
        if (number.signum() == -1){
            sign = "минус";
            number = number.negate();
        }


        ArrayList<Integer> list = new ArrayList<>();

        for (int exponent = 0; ONE_THOUSAND.pow(exponent).compareTo(number) <= 0; exponent++){
            list.add( ( number.divide( ONE_THOUSAND.pow(exponent) ).remainder(ONE_THOUSAND).intValue() ));
        }

        StringBuilder sb = new StringBuilder();

        for (int exponent = list.size()-1; exponent >= 0; exponent--){
            if(list.get(exponent) == 0){
                continue;
            }
            sb.append(" " + exponentOfThousand.asWords(list.get(exponent), exponent));
        }

        String result = sb.toString().substring(1);

        if (sign.length() != 0){
            result = sign +" "+ result;
        }

        return result;
    }


}
