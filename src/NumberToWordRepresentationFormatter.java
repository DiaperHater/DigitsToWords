import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class NumberToWordRepresentationFormatter {
    public String format(String n){

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

        BigInteger thousand = new BigInteger("1000");

        for (int i = 0; thousand.pow(i).compareTo(number) <= 0;i++){
            list.add( ( number.divide( thousand.pow(i) ).remainder(thousand).intValue() ));
        }

        ExponentOfThousandFormatter formatter = new ExponentOfThousandFormatter();
        StringBuilder sb = new StringBuilder();

        for (int i = list.size()-1; i >= 0; i--){
            if(list.get(i) == 0){
                continue;
            }
            sb.append(" " + formatter.format(list.get(i), i));
        }

        String result = sb.toString().substring(1);
        if (sign.length() != 0){
            result = sign +" "+ result;
        }

        return result;
    }

    public static void main(String[] args) {
        Random random = new Random(0);
        NumberToWordRepresentationFormatter f = new NumberToWordRepresentationFormatter();
        for (int i = 0; i < 20; i++) {
            String a = String.valueOf(random.nextInt(1000000000));
            System.out.println(f.format(a));
        }
    }

}
