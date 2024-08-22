package binary_search;

import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class ExampleScenarioToUsedBinarySearch {


    public void execute() {
        int first = 0;
        int last = 2147483647;
        int attempts = 1;
        while (first <= last) {
            int middle = (first + last) / 2;
            final String response = callServer(middle);
            if (response.equals("\"Hacked\"")) {
                System.out.println("hacked with this password: " + middle);
                break;
            }

            if (response.equals("\"Too High\"")) last = middle -1;

            if (response.equals("\"Too Low\"")) first = middle + 1;
            attempts++;
        }
        System.out.println("attempts: " + attempts);
    }

    private String callServer(int password) {
        Unirest.setTimeouts(0, 0);
        try {
            return Unirest.get("https://guess-a-number.azurewebsites.net/hack/" + password).asString().getBody();
        } catch (UnirestException e) {
            throw new RuntimeException(e);
        }
    }
}
