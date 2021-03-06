package DDT;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DataDao {

    private static final String filePath = "./test/DDT/dataForDDT.lst";

    private static Scanner scanner;

    static {
        try {
            scanner = new Scanner(new FileReader(filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public DataPair next(){
        String line = scanner.nextLine();
        return new DataPair(line);
    }

    public boolean hasNext(){
        return scanner.hasNext();
    }
    
}
