import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class type_racer {

    private static Random rand;
    private static int randomInt;
    static String[] words = {"mouse", "princess", "coffin", "license", "elephant", 
                        "damage", "mutter", "craftsman", "spine", 
                        "biscuit", "proclaim", "grateful", "anniversary", "competition",
                        "feminine", "banana", "rehabilitation", "concession"};
    public static void main(String[] args) throws InterruptedException {
        startRace();
        
    }
    
    // prints a randomized set of words to allow 
    // the user to input the set of words
    public static void startRace() throws InterruptedException {
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        rand = new Random();
        
        for (int i = 0; i <= 10; i++) {
            randomInt = rand.nextInt(18);
            System.out.print(words[randomInt] + " ");
        }

        System.out.println();

        double startTime = LocalTime.now().toNanoOfDay();
        Scanner console = new Scanner(System.in);
        String typedWords = console.nextLine();
        double endTime = LocalTime.now().toNanoOfDay();

        int WPM = calculateWPM(typedWords, startTime, endTime);

        System.out.println("WPM: " + WPM);
    }

    // determines the words per minute result 
    // based on time started and time ended
    public static int calculateWPM(String typedWords, double startTime, double endTime) {
        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;

        int Chars = typedWords.length();
        return (int) ((((double)Chars / 5) / seconds) * 60);
    }
}
