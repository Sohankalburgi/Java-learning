class Human
{
    int age;
    void sleep()
    {
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}

class student extends Human
{

}

class Inheritencebasic
{
    public static void main(String[] args) {
        student s = new student();
        s.sleep();
    }
}