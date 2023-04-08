import java.text.SimpleDateFormat;
import java.util.*;

class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day - month - year : ");
        // Accepting Date
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        year = year - 1900;
        month = month - 1;

        System.out.println("Enter Hour - min - sec : ");
        // Accepting time
        int hour = sc.nextInt();
        int min = sc.nextInt();
        int sec = sc.nextInt();
        Date dm = new Date();

        dm.setHours(hour);
        dm.setMinutes(min);
        dm.setSeconds(sec);

        Date dt = new Date();
        dt.setDate(day);
        dt.setMonth(month);
        dt.setYear(year);

        System.out.println();
        System.out.println("Formatted Date :   ");
        System.out.println("Format a. dd/mm/yyyy" +
                "   b. mm/dd/yyyy  " +
                "  c. yyyy/mm/dd");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
        String strDate = sdf.format(dt);
        System.out.println(strDate);

        SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yyy");
        String strDate1 = sdf1.format(dt);
        System.out.println(strDate1);

        SimpleDateFormat sdf2 = new SimpleDateFormat("yyy/MM/dd");
        String strDate2 = sdf2.format(dt);
        System.out.println(strDate2);

        System.out.println();
        System.out.println("Formatted time : ");
        System.out.println("a. hh:mm:ss   b. hh:mm:ss    c. hh:mm");

        SimpleDateFormat stf = new SimpleDateFormat("kk:mm:ss");
        String strTime = stf.format(dm);
        System.out.println(strTime);

        SimpleDateFormat stf1 = new SimpleDateFormat("hh:mm:ss");
        String strTime1 = stf1.format(dm);
        System.out.println(strTime1);

        SimpleDateFormat stf2 = new SimpleDateFormat("kk:mm");
        String strTime2 = stf2.format(dm);
        System.out.println(strTime2);

        System.out.print(strDate + "  ");
        System.out.println(strTime);

        System.out.print(strDate1 + "  ");
        System.out.println(strTime1);

        System.out.print(strDate2 + "   ");
        System.out.println(strTime2);
    }
}