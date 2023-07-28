import java.time.*;
import java.util.*;
public class programtoconvertdatetostring
{
    public static void main(String[] args) {
        LocalDate d = LocalDate.now();
        Integer day = d.getDayOfMonth();
        Integer month = d.getMonthValue();
        Integer year = d.getYear();
        String date = day.toString()+"/"+month.toString()+"/"+year.toString();
        System.out.println(date);


    }
}