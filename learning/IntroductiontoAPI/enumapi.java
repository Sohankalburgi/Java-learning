
enum Week{
    MON,TUE,WED,THU,FRI,SAT;    
}

public class enumapi {

    enum Result{
        PASS,FAIL,NORESULT; 
    }
    public static void main(String[] args) {
        Week w = Week.MON;
        System.out.println(w);
        System.out.println(Result.PASS);

        int index = Week.WED.ordinal();
        System.out.println("The index :"+index);

        System.out.println("to call all the enum constant in array at once");
        Week warr[]=Week.values();
        for(Week i : warr)
        {
            System.out.println(i+" : "+i.ordinal());
        }
        Week.WED.get
    }
}
