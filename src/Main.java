import binary_search.BinarySearch;
import binary_search.ExampleScenarioToUsedBinarySearch;
import binary_search.Search;
import binary_search.SimpleSearch;

public class Main {
    public static void main(String[] args) {

        Search binarySearch = new BinarySearch();
        binarySearch.execute(1000);

        Search simpleSearch = new SimpleSearch();
        simpleSearch.execute(1000);

        ExampleScenarioToUsedBinarySearch search = new ExampleScenarioToUsedBinarySearch();
        search.execute();
    }
}