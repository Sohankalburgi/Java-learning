import java.time.*;
public class jodatimeapi {
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        System.out.println(d.getDayOfMonth());
        System.out.println(d.getYear());
        System.out.println(d.getMonthValue());
        System.out.println(d);

        LocalTime t = LocalTime.now();
        System.out.println(t);
        System.out.println(t.getHour()-12);
        System.out.println(t.getMinute());
        System.out.println(t.getSecond());
        System.out.println(t.getNano()/Math.pow(10,9));
    }
}
