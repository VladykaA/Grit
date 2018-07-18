import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CountSeconds {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input first date in format dd/mm/yyyy HH:mm");
        String dateOne = sc.nextLine();
        System.out.println("Input second date in format dd/mm/yyyy HH:mm");
        String dateTwo = sc.nextLine();

        SimpleDateFormat sdf  = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        Date d1 = null;
        Date d2 = null;

        try{
            d1= sdf.parse(dateOne);
            d2 = sdf.parse(dateTwo);

            long diff = Math.abs(d1.getTime()-d2.getTime());
            long seconds = diff/100;

            System.out.println("Seconds " + seconds);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
