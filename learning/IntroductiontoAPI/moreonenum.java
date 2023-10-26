enum Result{
    
    PASS,FAIL,NORESULT,JP;
    // public static final Result PASS = new Result();
    // public static final Result FAIL = new Result();
    // public static final Result NORESULT = new Result();
    // the above is JVM called hence three constructor call is done hence shown in output


    int marks; // variables are defined
    Result() // constructor are defined
    {
        System.out.println("enum result constructor is called");
    }
    void setMarks(int marks) // methods are defined
    {
        this.marks= marks;
    }
    int getMarks()
    {
        return marks;
    }
}


public class moreonenum {
    public static void main(String[] args) {
        Result.PASS.setMarks(50); // set Marks is only for the Pass
        int m = Result.PASS.getMarks();
        System.out.println(m); // set Marks is only for the Pass hence  fail has 0
        System.out.println(Result.FAIL.getMarks()); 
        
        Result.NORESULT.setMarks(90);
        System.out.println(Result.NORESULT.getMarks());

    }
}
