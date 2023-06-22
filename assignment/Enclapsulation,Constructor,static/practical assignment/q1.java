//1.Create a class that keeps track of the number of instances created. Implement a static
//variable and method to accomplish this.
class q1
{
    private static int instance = 0;
    void instancecount()
    {
        instance++;
    }

    static int display()
    {
        return instance;
    }
}
class main{
    public static void main(String[] args) {
        q1 a = new q1();
        q1 b = new q1();
        a.instancecount();
        b.instancecount();
        int ans = q1.display();
        System.out.println(ans);
    }
}