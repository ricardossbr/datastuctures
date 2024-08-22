package binary_search;

import model.SourceBuilder;

public class SimpleSearch implements Search{

    @Override
    public void execute(int chosenNumber) {
        System.out.println("To execute a Simple Search");
        int[] array = SourceBuilder.getShortListNumbers();
        int fist = 0;
        int last = array.length - 1;
        int attempts = 1;
        while(fist <= last) {
            if(fist == chosenNumber) {
                System.out.println("chosenNumber: " + chosenNumber);
                break;
            }
            attempts++;
            fist++;
        }
        System.out.println("attempts: " + attempts);
    }
}
