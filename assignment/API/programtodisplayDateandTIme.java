import java.sql.Time;
import java.time.*;
class programtodisplayDateandTime
{
    public static void main(String[] args) {
        LocalTime t = LocalTime.now();
        LocalDate d = LocalDate.now();
        
        System.out.println("Date : "+d.getDayOfMonth()+" - "+d.getMonth()+" - "+d.getYear());
        System.out.println("Time : "+t.getHour()+":"+t.getMinute()+":"+t.getSecond());
        
    }
}