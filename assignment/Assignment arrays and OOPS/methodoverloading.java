import java.util.Scanner;

class methodoverloading {

    static int add(int a,int b) // the add method for two arguments
    {
        return a+b;
    }
    static int add (int a,int b,int c)  // the add method for three arguments
    {
        return a+b+c;
    }

    static float add(float a,float b) //  the add method for different type of arguments
    {
        return a+b;
    }



    public static void main(String argvs[])
    {
        Scanner sc = new Scanner(System.in);
        int result = add(2,3,5);
        int result1 = add(2,3);
        float result2 = add((float)2.5,(float)6.5);
        // the demo of the method overloading is seen here as shown in the program.
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
    }

}
