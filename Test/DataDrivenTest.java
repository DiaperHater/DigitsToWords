import DDT.DataDao;
import DDT.DataPair;

import org.junit.Test;
import static org.junit.Assert.*;

public class DataDrivenTest {

    private static final NumberToWordRepresentationFormatter formater = new NumberToWordRepresentationFormatter();


    @Test
    public void test(){

        DataDao dataDao = new DataDao();
        DataPair pair;

        while (dataDao.hasNext()){
            pair = dataDao.next();
            assertEquals(pair.expectedValue, formater.format(pair.argumentValue));
        }

    }
}
