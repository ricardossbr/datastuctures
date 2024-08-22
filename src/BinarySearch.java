import model.SourceBuilder;

public class BinarySearch {

    public void execute(int chosenNumber){
        int[] array = SourceBuilder.getBigListNumbers();
        int first = 0;
        int last = array.length - 1;
        int attempts = 1;
        while(first <= last){
            int half = (first + last) / 2;
            int guess = array[half];

            if(array[half] == chosenNumber){
                System.out.println("chosenNumber: " + chosenNumber);
                break;
            }

            if(guess > chosenNumber ) last = half - 1;

            if(guess < chosenNumber) first = half + 1;

            attempts++;
        }
        System.out.println("attempts: " + attempts);
    }
}
