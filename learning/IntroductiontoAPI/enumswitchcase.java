enum Result{
    PASS,FAIL,NR;
}


public class enumswitchcase {
    public static void main(String[] args) {
        
        Result res = Result.NR;
        
        switch(res)
        {
            case PASS :
            System.out.println("Passed!");
            break;
            case FAIL :
            System.out.println("Fail");
            break;
            case NR:
            System.out.println("NO result");
            break;
        }

    }
}
