import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

class NamesOfNumbersDao implements NameListDao {

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

}
