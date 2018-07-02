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

    public static void main(String[] args) throws FileNotFoundException {
        DataDao dao = new DataDao();
        while (dao.hasNext()){
            DataPair pair = dao.next();
            System.out.println(pair.argumentValue +" "+pair.expectedValue);
        }
    }
}
