package exceptionHandling;

class Demo{
    public void a()
    {
        try
        {
            b();
        }
        catch(Exception o)
        {
            System.out.println("error "+ o.getMessage());
        }

    }
    public void b() throws Exception
    {
        int result = 8/0;
        System.out.println(result);

    }
}

public class throwsexcept {
    public static void main(String[] args) {
        Demo h = new Demo();
        h.a();
    }
    
}
