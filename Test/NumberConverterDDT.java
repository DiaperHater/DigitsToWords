import DDT.DataDao;
import DDT.DataPair;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberConverterDDT {

    private static final NumberConverter converter = new NumberConverter();


    @Test
    public void test(){

        DataDao dataDao = new DataDao();
        DataPair pair;

        while (dataDao.hasNext()){
            pair = dataDao.next();
            assertEquals(pair.expectedValue, converter.asWords(pair.argumentValue));
        }

    }
}
