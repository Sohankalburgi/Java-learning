import java.lang.annotation.*;

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@interface Cricketplayer
{
    String country() default "INdia";
    int age() default 34;
} 

@Cricketplayer(country="INDIA")
class Virat {
    @Cricketplayer
    private int innings;
    private int runs;


    public int getInnings() {
        return innings;
    }

    public void setInnings(int innings) {
        this.innings = innings;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

}

public class customannotation {
    public static void main(String[] args) {
        Virat v = new Virat();
        v.setInnings(100);
        v.setRuns(500);

        System.out.println(v.getInnings());
        System.out.println(v.getRuns());

        Class c=v.getClass();
        Annotation a =c.getAnnotation(Cricketplayer.class);
        Cricketplayer cp = (Cricketplayer)a;
        String t=cp.country();
        int age = cp.age();
        System.out.println(t);
        System.out.println(age);
    }
}
