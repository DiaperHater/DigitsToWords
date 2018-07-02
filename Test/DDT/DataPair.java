package DDT;

public class DataPair {

    public String argumentValue;
    public String expectedValue;

    public DataPair(String line) {
        String[] a = line.split("\\s?=\\s?");
        argumentValue = a[0];
        expectedValue = a[1];
    }
}
