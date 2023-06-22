//5.Write a program which has static block and constructor overloading,initialise variables
//using constructors and print it.
class sum{
    private int a,b,c,d;
    sum(int a,int b)
    {
        this.a=a;
        this.b=b;
    }

    sum(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }

    sum(int a,int b,int c,int d)
    {
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
    }
    int display()
    {
        return a+b+c+d;
    }
}

public class q5 {

    public static void main(String[] args) {
        sum s1= new sum(5, 6);
        System.out.println(s1.display());

        sum s2 = new sum(99,566,333);
        System.out.println(s2.display());

    }
}
