import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Scanner;

public class CountSeconds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first date in format dd/mm/yyyy HH:mm");
        String dateOne = sc.nextLine();
        System.out.println("Input second date in format dd/mm/yyyy HH:mm");
        String dateTwo = sc.nextLine();

        LocalDateTime d1 = LocalDateTime.parse(dateOne);
        LocalDateTime d2 = LocalDateTime.parse(dateTwo);

        long diff = Duration.between(d1, d2).toMillis();
        long seconds = diff / 100;

        System.out.println("Seconds " + seconds);
        sc.close();
    }
}
