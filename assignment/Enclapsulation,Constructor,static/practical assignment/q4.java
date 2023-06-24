//4.Write a program to call an method without creating an object of a class

class q4
{
    static void print()
    {
    System.out.println("hello world");
    }
}
class display{
    public static void main(String[] args) {
        q4.print();
    }
}