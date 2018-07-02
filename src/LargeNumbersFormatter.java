import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class LargeNumbersFormatter {
    public String format(String n){

        if (n.toCharArray()[0] == '-'){
            throw new IllegalArgumentException("Negative Numbers are not allowed here!");
        }

        BigInteger number = new BigInteger(n);
        if (number.signum() == 0){
            return "ноль";
        }
        ArrayList<Integer> list = new ArrayList<>();

        BigInteger thousand = new BigInteger("1000");

        for (int i = 0; thousand.pow(i).compareTo(number) <= 0;i++){
            list.add( ( number.divide( thousand.pow(i) ).remainder(thousand).intValue() ));
        }

        ExponentOfThousandFormatter formatter = new ExponentOfThousandFormatter();
        StringBuilder sb = new StringBuilder();

        for (int i = list.size()-1; i >= 0; i--){
            sb.append(" " + formatter.format(list.get(i), i));
        }

        String result = sb.toString().substring(1);

        return result;
    }

    public static void main(String[] args) {
        Random random = new Random(0);
        LargeNumbersFormatter f = new LargeNumbersFormatter();
        for (int i = 0; i < 20; i++) {
            String a = String.valueOf(random.nextInt(Integer.MAX_VALUE));
            String b = String.valueOf(random.nextInt(Integer.MAX_VALUE));

            System.out.println(f.format(a+b));
        }
    }

}
