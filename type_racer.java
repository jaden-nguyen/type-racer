import java.time.LocalTime;
import java.util.concurrent.TimeUnit;
import java.util.*;

public class type_racer {

    static String[] words = {"mouse", "princess", "coffin", "license", "elephant", 
                        "damage", "mutter", "craftsman", "spine", 
                        "biscuit", "proclaim", "grateful", "anniversary", "competition",
                        "feminine", "banana", "rehabilitation", "concession"};
    public static void main(String[] args) throws InterruptedException {
        
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();

        int randomInt = 0;
        for (int i = 0; i <= 10; i++) {
            randomInt = rand.nextInt(18);
            System.out.print(words[randomInt] + " ");
        }
        System.out.println();

        double startTime = LocalTime.now().toNanoOfDay();
        
        Scanner console = new Scanner(System.in);
        String typedWords = console.nextLine();
        
        double endTime = LocalTime.now().toNanoOfDay();

        double elapsedTime = endTime - startTime;
        double seconds = elapsedTime / 1000000000.0;

        int Chars = typedWords.length();
        int WPM = (int) ((((double)Chars / 5) / seconds) * 60);
        System.out.println("WPM: " + WPM);
        
    }
}
