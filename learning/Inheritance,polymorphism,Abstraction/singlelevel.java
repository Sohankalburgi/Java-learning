class animal{
    void sleep()
    {
        System.out.println("Animal needs sleep");
    }
}

class Tiger extends animal
{
 // single level inheritence
}

public class singlelevel {
    public static void main(String[] args) {
        Tiger T = new Tiger();
        T.sleep();
    }
}
