import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class NamesOfLargeNumbersDao implements NameListDao {

    private static final String FILE_PATH = "./resourсes/namesOfNumbers.lst";
    private static final int numberOfLinesInFile = 33;

    @Override
    public String getName(int exponent) {
        if (exponent < 1){
            throw new IllegalArgumentException(" exponent arg CAN NOT BE NEGATIVE!");
        }
        if (exponent > numberOfLinesInFile){
            throw new IllegalArgumentException("exponent arg IS TO BIG! File does not contain so many lines!");
        }


        try {
            FileReader file = new FileReader(FILE_PATH);
            Scanner scanner = new Scanner(file);

            String result = null;
            for (int i = 1; i <= exponent ; i++) {
                result = scanner.nextLine()
                        .replace("\n", "")
                        .replace("\r", "");
            }

            file.close();
            return result;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        NamesOfLargeNumbersDao dao = new NamesOfLargeNumbersDao();

        Random rand = new Random(1);
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt(33);
            System.out.println(r + " " + dao.getName(r));
        }
    }
}
